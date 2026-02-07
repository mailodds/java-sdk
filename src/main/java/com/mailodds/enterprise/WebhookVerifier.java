package com.mailodds.enterprise;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * Verifies MailOdds webhook signatures using HMAC-SHA256.
 */
public class WebhookVerifier {

    private final String secret;

    public WebhookVerifier(String secret) {
        if (secret == null || secret.isEmpty()) {
            throw new IllegalArgumentException("Webhook secret must not be null or empty");
        }
        this.secret = secret;
    }

    /**
     * Verify a webhook request signature.
     *
     * @param payload   The raw request body (JSON string)
     * @param signature The X-MailOdds-Signature header value
     * @return true if the signature is valid
     */
    public boolean verify(String payload, String signature) {
        try {
            String expected = computeHmac(payload);
            return MessageDigest.isEqual(
                expected.getBytes(StandardCharsets.UTF_8),
                signature.getBytes(StandardCharsets.UTF_8)
            );
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Verify and return the payload. Throws if signature is invalid.
     *
     * @param payload   The raw request body
     * @param signature The X-MailOdds-Signature header value
     * @return The verified payload string
     * @throws WebhookVerificationException if the signature is invalid
     */
    public String verifyOrThrow(String payload, String signature) {
        if (!verify(payload, signature)) {
            throw new WebhookVerificationException("Invalid webhook signature");
        }
        return payload;
    }

    private String computeHmac(String data) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec keySpec = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        mac.init(keySpec);
        byte[] hash = mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
        StringBuilder hex = new StringBuilder();
        for (byte b : hash) {
            hex.append(String.format("%02x", b));
        }
        return hex.toString();
    }

    public static class WebhookVerificationException extends RuntimeException {
        public WebhookVerificationException(String message) {
            super(message);
        }
    }
}
