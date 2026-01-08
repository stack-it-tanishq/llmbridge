package com.practice.model;


/*
Never expose OpenAI-specific classes
This ensures SDK stability across providers
*/
public enum Role {
    SYSTEM, USER, ASSISTANT
}
