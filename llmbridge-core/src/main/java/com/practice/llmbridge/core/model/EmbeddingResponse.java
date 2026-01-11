package com.practice.llmbridge.core.model;

import java.util.List;

public class EmbeddingResponse {

    private final List<List<Double>> vectors;

    public EmbeddingResponse(List<List<Double>> vectors) {
        this.vectors = vectors;
    }

    public List<List<Double>> getVectors() {
        return vectors;
    }
}
