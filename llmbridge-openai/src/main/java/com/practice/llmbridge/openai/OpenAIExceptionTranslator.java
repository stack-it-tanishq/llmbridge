package com.practice.llmbridge.openai;

import com.practice.llmbridge.core.exception.ProviderException;

public class OpenAIExceptionTranslator {

    public static ProviderException translate(Throwable t) {
        return new ProviderException("OpenAI provider error", t);
    }
}
