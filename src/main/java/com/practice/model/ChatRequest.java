package com.practice.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class ChatRequest {

    private final String model;
    private final List<Message> messages;
    private final double temperature;
    private final Map<String, Object> metadata;

}

