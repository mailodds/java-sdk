package com.mailodds.enterprise;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * OkHttp interceptor that retries on 429 (rate limit) and 5xx (server error)
 * with exponential backoff and jitter.
 * Does NOT retry 4xx (except 429).
 */
public class RetryInterceptor implements Interceptor {

    private final int maxRetries;
    private final long baseDelayMs;
    private final long maxDelayMs;

    public RetryInterceptor() {
        this(3, 1000L, 30_000L);
    }

    public RetryInterceptor(int maxRetries, long baseDelayMs) {
        this(maxRetries, baseDelayMs, 30_000L);
    }

    public RetryInterceptor(int maxRetries, long baseDelayMs, long maxDelayMs) {
        this.maxRetries = maxRetries;
        this.baseDelayMs = baseDelayMs;
        this.maxDelayMs = maxDelayMs;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        IOException lastException = null;

        for (int attempt = 0; attempt <= maxRetries; attempt++) {
            try {
                Response response = chain.proceed(request);
                int code = response.code();

                if (!shouldRetry(code) || attempt == maxRetries) {
                    return response;
                }

                response.close();
                sleep(attempt);
            } catch (IOException e) {
                lastException = e;
                if (attempt == maxRetries) {
                    throw e;
                }
                sleep(attempt);
            }
        }

        throw lastException != null ? lastException : new IOException("Max retries exceeded");
    }

    private boolean shouldRetry(int statusCode) {
        return statusCode == 429 || statusCode >= 500;
    }

    private void sleep(int attempt) {
        long delay = Math.min(baseDelayMs * (1L << attempt), maxDelayMs);
        long jitter = (long) (delay * 0.1 * ThreadLocalRandom.current().nextDouble());
        try {
            Thread.sleep(delay + jitter);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
