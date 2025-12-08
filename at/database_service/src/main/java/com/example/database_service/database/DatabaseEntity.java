package com.example.database_service.database;

import org.springframework.data.annotation.Id;

public record DatabaseEntity(
        @Id Long id,
        String info
) {}