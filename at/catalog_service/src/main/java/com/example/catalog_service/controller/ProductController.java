package com.example.catalog_service.controller;

import com.example.catalog_service.domain.Product;
import com.example.catalog_service.service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/products")
    public Flux<Product> list() {
        return service.list();
    }

    @GetMapping("/products/{id}")
    public Mono<Product> find(@PathVariable Long id) {
        return service.find(id);
    }
}