package com.example.catalog_service.domain;

import org.springframework.data.annotation.Id;

public record Product(@Id Long id, String name, Double price) {}