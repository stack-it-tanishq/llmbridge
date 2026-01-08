package com.practice.api;

import com.practice.model.ChatRequest;
import com.practice.model.ChatResponse;

/*
* Allows multiple implementations
* Stable API for SDK consumers
* */
public interface LLMBridge {
    ChatResponse chat(ChatRequest request);

    // Future additions (non-breaking)
    // ImageResponse generateImage(...)
    // Stream<ChatChunk> streamChat(...)
}
