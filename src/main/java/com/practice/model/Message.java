package com.practice.model;

import lombok.Data;

import javax.management.relation.Role;

@Data
public class Message {
    private final Role role;
    private final String content;
}
