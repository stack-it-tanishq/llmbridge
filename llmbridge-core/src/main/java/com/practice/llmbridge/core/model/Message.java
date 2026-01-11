package com.practice.llmbridge.core.model;

public record Message(
        Role role,
        String content
) {}
