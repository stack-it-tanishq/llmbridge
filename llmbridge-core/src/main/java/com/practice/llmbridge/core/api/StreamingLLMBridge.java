package com.practice.llmbridge.core.api;

import com.practice.llmbridge.core.model.ChatRequest;
import com.practice.llmbridge.core.model.ChatResponse;

import java.util.stream.Stream;

public interface StreamingLLMBridge {

    Stream<ChatResponse> streamChat(ChatRequest request);
}
