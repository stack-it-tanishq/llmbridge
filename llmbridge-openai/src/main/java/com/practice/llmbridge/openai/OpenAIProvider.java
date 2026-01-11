package com.practice.llmbridge.openai;

import com.practice.llmbridge.core.model.ChatRequest;
import com.practice.llmbridge.core.model.ChatResponse;
import com.practice.llmbridge.core.model.EmbeddingRequest;
import com.practice.llmbridge.core.model.EmbeddingResponse;
import com.practice.llmbridge.core.provider.LLMProvider;
import com.practice.llmbridge.core.provider.ProviderType;

import java.util.Collections;

public class OpenAIProvider implements LLMProvider {

    private final OpenAIConfig config;

    public OpenAIProvider(OpenAIConfig config) {
        this.config = config;
    }

    @Override
    public ChatResponse chat(ChatRequest request) {
        try {
            // TODO integrate openai-java here
            return new ChatResponse(
                    "stub-response",
                    request.getModel(),
                    null,
                    Collections.emptyMap()
            );
        } catch (Exception e) {
            throw OpenAIExceptionTranslator.translate(e);
        }
    }

    @Override
    public EmbeddingResponse embed(EmbeddingRequest request) {
        return new EmbeddingResponse(Collections.emptyList());
    }

    @Override
    public ProviderType getType() {
        return ProviderType.OPENAI;
    }
}
