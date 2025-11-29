package com.example.tp3_catalog_service.product;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<Product> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> byId(@PathVariable Long id) {
        return service.findById(id);
    }
}