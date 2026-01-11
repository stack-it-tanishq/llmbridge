package com.practice.llmbridge.core;

import com.practice.llmbridge.core.api.LLMBridge;
import com.practice.llmbridge.core.interceptor.LLMInterceptor;
import com.practice.llmbridge.core.model.ChatRequest;
import com.practice.llmbridge.core.model.ChatResponse;
import com.practice.llmbridge.core.model.EmbeddingRequest;
import com.practice.llmbridge.core.model.EmbeddingResponse;

import java.util.List;

public class InterceptingLLMBridge implements LLMBridge {

    private final LLMBridge delegate;
    private final List<LLMInterceptor> interceptors;

    public InterceptingLLMBridge(LLMBridge delegate, List<LLMInterceptor> interceptors) {
        this.delegate = delegate;
        this.interceptors = interceptors;
    }

    @Override
    public ChatResponse chat(ChatRequest request) {
        interceptors.forEach(i -> i.beforeRequest(request));
        try {
            ChatResponse response = delegate.chat(request);
            interceptors.forEach(i -> i.afterResponse(response));
            return response;
        } catch (Exception e) {
            interceptors.forEach(i -> i.onError(e));
            throw e;
        }
    }

    @Override
    public EmbeddingResponse embed(EmbeddingRequest request) {
        return delegate.embed(request);
    }
}
