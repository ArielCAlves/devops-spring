package com.example.order_service.controller;

import com.example.order_service.client.CatalogClient;
import com.example.order_service.dto.ProductDTO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class OrderController {

    private final CatalogClient client;

    public OrderController(CatalogClient client) {
        this.client = client;
    }

    @GetMapping("/order/{id}")
    public Mono<ProductDTO> getProduct(@PathVariable Long id) {
        return client.getProduct(id);
    }
}