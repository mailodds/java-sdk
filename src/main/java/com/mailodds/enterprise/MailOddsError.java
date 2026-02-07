package com.mailodds.enterprise;

import com.mailodds.ApiException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

/**
 * Typed error hierarchy for MailOdds API responses.
 * Each HTTP status code maps to a specific exception type with parsed error details.
 */
public class MailOddsError extends RuntimeException {

    private final int statusCode;
    private final String errorCode;
    private final String requestId;
    private final String responseBody;

    public MailOddsError(String message, int statusCode, String errorCode, String requestId, String responseBody) {
        super(message);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
        this.requestId = requestId;
        this.responseBody = responseBody;
    }

    public int getStatusCode() { return statusCode; }
    public String getErrorCode() { return errorCode; }
    public String getRequestId() { return requestId; }
    public String getResponseBody() { return responseBody; }

    public static MailOddsError fromApiException(ApiException e) {
        String body = e.getResponseBody() != null ? e.getResponseBody() : "{}";
        String message = e.getMessage();
        String errorCode = null;
        String requestId = null;
        JsonObject json = null;

        try {
            json = JsonParser.parseString(body).getAsJsonObject();
            if (json.has("message")) message = json.get("message").getAsString();
            if (json.has("error")) errorCode = json.get("error").getAsString();
            if (json.has("request_id")) requestId = json.get("request_id").getAsString();
        } catch (JsonSyntaxException | IllegalStateException ignored) {}

        int status = e.getCode();
        return switch (status) {
            case 400 -> new BadRequestError(message, errorCode, requestId, body);
            case 401 -> new UnauthorizedError(message, errorCode, requestId, body);
            case 402 -> InsufficientCreditsError.fromJson(message, errorCode, requestId, body, json);
            case 403 -> new ForbiddenError(message, errorCode, requestId, body);
            case 429 -> new RateLimitError(message, errorCode, requestId, body);
            default -> status >= 500
                ? new ServerError(message, status, errorCode, requestId, body)
                : new MailOddsError(message, status, errorCode, requestId, body);
        };
    }

    // --- Typed subclasses ---

    public static class BadRequestError extends MailOddsError {
        public BadRequestError(String msg, String code, String reqId, String body) {
            super(msg, 400, code, reqId, body);
        }
    }

    public static class UnauthorizedError extends MailOddsError {
        public UnauthorizedError(String msg, String code, String reqId, String body) {
            super(msg, 401, code, reqId, body);
        }
    }

    public static class InsufficientCreditsError extends MailOddsError {
        private final int creditsAvailable;
        private final int creditsNeeded;
        private final String upgradeUrl;

        public InsufficientCreditsError(String msg, String code, String reqId, String body,
                                         int creditsAvailable, int creditsNeeded, String upgradeUrl) {
            super(msg, 402, code, reqId, body);
            this.creditsAvailable = creditsAvailable;
            this.creditsNeeded = creditsNeeded;
            this.upgradeUrl = upgradeUrl;
        }

        public int getCreditsAvailable() { return creditsAvailable; }
        public int getCreditsNeeded() { return creditsNeeded; }
        public String getUpgradeUrl() { return upgradeUrl; }

        static InsufficientCreditsError fromJson(String msg, String code, String reqId, String body, JsonObject json) {
            int available = 0;
            int needed = 0;
            String url = null;
            if (json != null) {
                if (json.has("credits_available")) available = json.get("credits_available").getAsInt();
                if (json.has("credits_needed")) needed = json.get("credits_needed").getAsInt();
                if (json.has("upgrade_url")) url = json.get("upgrade_url").getAsString();
            }
            return new InsufficientCreditsError(msg, code, reqId, body, available, needed, url);
        }
    }

    public static class ForbiddenError extends MailOddsError {
        public ForbiddenError(String msg, String code, String reqId, String body) {
            super(msg, 403, code, reqId, body);
        }
    }

    public static class RateLimitError extends MailOddsError {
        public RateLimitError(String msg, String code, String reqId, String body) {
            super(msg, 429, code, reqId, body);
        }
    }

    public static class ServerError extends MailOddsError {
        public ServerError(String msg, int status, String code, String reqId, String body) {
            super(msg, status, code, reqId, body);
        }
    }
}
