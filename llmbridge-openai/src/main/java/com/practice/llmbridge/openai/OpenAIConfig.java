package com.practice.llmbridge.openai;

import com.practice.llmbridge.core.exception.LLMBridgeException;

public class OpenAIConfig {

    private final String apiKey;

    public OpenAIConfig(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    // Add this static factory method
    public static OpenAIConfig fromEnv() {
        String apiKey = System.getenv("OPENAI_API_KEY");
        // Provide a default model if the env var isn't set
//        String model = System.getenv().getOrDefault("OPENAI_MODEL", "gpt-4");

        if (apiKey == null || apiKey.isEmpty()) {
            throw new LLMBridgeException("OPENAI_API_KEY environment variable is not set");
        }

        return new OpenAIConfig(apiKey);
    }
}
