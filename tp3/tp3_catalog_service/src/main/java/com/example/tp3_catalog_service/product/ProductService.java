package com.example.tp3_catalog_service.product;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public Flux<Product> findAll() {
        return Flux.fromIterable(repo.findAll());
    }

    public Mono<Product> findById(Long id) {
        return Mono.justOrEmpty(repo.findById(id));
    }
}