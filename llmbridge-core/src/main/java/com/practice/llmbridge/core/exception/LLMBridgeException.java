package com.practice.llmbridge.core.exception;

public class LLMBridgeException extends RuntimeException {

    public LLMBridgeException(String message) {
        super(message);
    }

    public LLMBridgeException(String message, Throwable cause) {
        super(message, cause);
    }
}
