package com.practice.llmbridge.core.model;

public record TokenUsage(
        int promptTokens,
        int completionTokens,
        int totalTokens
) {}
