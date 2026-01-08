package com.practice.model;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class ChatResponse {
    private final String content;
    private final String model;
//    private final TokenUsage usage;
    private final Map<String, Object> raw;

    // raw = optional provider-specific data
}
