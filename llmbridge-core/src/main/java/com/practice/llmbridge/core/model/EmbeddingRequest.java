package com.practice.llmbridge.core.model;

import java.util.List;

public class EmbeddingRequest {

    private final String model;
    private final List<String> inputs;

    public EmbeddingRequest(String model, List<String> inputs) {
        this.model = model;
        this.inputs = inputs;
    }

    public String getModel() {
        return model;
    }

    public List<String> getInputs() {
        return inputs;
    }
}
