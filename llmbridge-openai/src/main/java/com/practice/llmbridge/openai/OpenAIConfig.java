package com.practice.llmbridge.openai;

public class OpenAIConfig {

    private final String apiKey;

    public OpenAIConfig(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
