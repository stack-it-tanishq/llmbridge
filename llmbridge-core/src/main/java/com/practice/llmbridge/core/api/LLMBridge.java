package com.practice.llmbridge.core.api;

import com.practice.llmbridge.core.model.ChatRequest;
import com.practice.llmbridge.core.model.ChatResponse;
import com.practice.llmbridge.core.model.EmbeddingRequest;
import com.practice.llmbridge.core.model.EmbeddingResponse;

public interface LLMBridge {

    ChatResponse chat(ChatRequest request);

    EmbeddingResponse embed(EmbeddingRequest request);
}
