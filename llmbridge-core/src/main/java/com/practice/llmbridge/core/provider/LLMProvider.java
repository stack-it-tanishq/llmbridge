package com.practice.llmbridge.core.provider;

import com.practice.llmbridge.core.model.ChatRequest;
import com.practice.llmbridge.core.model.ChatResponse;
import com.practice.llmbridge.core.model.EmbeddingRequest;
import com.practice.llmbridge.core.model.EmbeddingResponse;

public interface LLMProvider {

    ChatResponse chat(ChatRequest request);

    EmbeddingResponse embed(EmbeddingRequest request);

    ProviderType getType();
}
