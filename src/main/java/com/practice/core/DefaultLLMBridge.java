package com.practice.core;

import com.practice.api.LLMBridge;
import com.practice.api.LLMProvider;
import com.practice.model.ChatRequest;
import com.practice.model.ChatResponse;

public class DefaultLLMBridge implements LLMBridge {

    private final LLMProvider provider;

    public DefaultLLMBridge(LLMProvider llmProvider){
        this.provider = llmProvider;
    }

    @Override
    public ChatResponse chat(ChatRequest request) {
        return provider.chat(request);
    }



}
