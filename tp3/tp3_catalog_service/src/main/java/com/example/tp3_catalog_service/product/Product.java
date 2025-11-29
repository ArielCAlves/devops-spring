package com.example.tp3_catalog_service.product;

import org.springframework.data.annotation.Id;

public record Product(
        @Id Long id,
        String name,
        Double price
) {}