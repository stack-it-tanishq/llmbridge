package com.practice.llmbridge.core;

import com.practice.llmbridge.core.api.LLMBridge;
import com.practice.llmbridge.core.model.ChatRequest;
import com.practice.llmbridge.core.model.ChatResponse;
import com.practice.llmbridge.core.model.EmbeddingRequest;
import com.practice.llmbridge.core.model.EmbeddingResponse;
import com.practice.llmbridge.core.provider.LLMProvider;

public class DefaultLLMBridge implements LLMBridge {

    private final LLMProvider provider;

    public DefaultLLMBridge(LLMProvider provider) {
        this.provider = provider;
    }

    @Override
    public ChatResponse chat(ChatRequest request) {
        return provider.chat(request);
    }

    @Override
    public EmbeddingResponse embed(EmbeddingRequest request) {
        return provider.embed(request);
    }
}
