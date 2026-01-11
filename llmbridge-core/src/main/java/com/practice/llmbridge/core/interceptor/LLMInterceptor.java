package com.practice.llmbridge.core.interceptor;

import com.practice.llmbridge.core.model.ChatRequest;
import com.practice.llmbridge.core.model.ChatResponse;

public interface LLMInterceptor {

    default void beforeRequest(ChatRequest request) {}

    default void afterResponse(ChatResponse response) {}

    default void onError(Throwable throwable) {}
}
