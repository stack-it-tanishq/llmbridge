package com.practice.provider.openai;

import com.practice.api.LLMProvider;
import com.practice.model.ChatRequest;
import com.practice.model.ChatResponse;
import com.practice.model.ProviderType;

public class OpenAIProvider implements LLMProvider {

//    private final OpenAIClient client;


    @Override
    public ChatResponse chat(ChatRequest request) {
        return null;
    }

    @Override
    public ProviderType getType() {
        return null;
    }
}
