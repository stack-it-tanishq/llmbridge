package com.practice.api;

import com.practice.model.ChatRequest;
import com.practice.model.ChatResponse;
import com.practice.model.ProviderType;

public interface LLMProvider {

    ChatResponse chat(ChatRequest request);

    ProviderType getType();
}
