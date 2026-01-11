package com.practice.llmbridge.core.model;

import java.util.List;
import java.util.Map;

public class ChatRequest {

    private final String model;
    private final List<Message> messages;
    private final double temperature;
    private final Map<String, Object> metadata;

    public ChatRequest(
            String model,
            List<Message> messages,
            double temperature,
            Map<String, Object> metadata
    ) {
        this.model = model;
        this.messages = messages;
        this.temperature = temperature;
        this.metadata = metadata;
    }

    public String getModel() {
        return model;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public double getTemperature() {
        return temperature;
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }
}
