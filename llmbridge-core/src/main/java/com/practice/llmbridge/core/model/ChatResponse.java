package com.practice.llmbridge.core.model;

import java.util.Map;

public class ChatResponse {

    private final String content;
    private final String model;
    private final TokenUsage usage;
    private final Map<String, Object> raw;

    public ChatResponse(
            String content,
            String model,
            TokenUsage usage,
            Map<String, Object> raw
    ) {
        this.content = content;
        this.model = model;
        this.usage = usage;
        this.raw = raw;
    }

    public String getContent() {
        return content;
    }

    public String getModel() {
        return model;
    }

    public TokenUsage getUsage() {
        return usage;
    }

    public Map<String, Object> getRaw() {
        return raw;
    }
}
