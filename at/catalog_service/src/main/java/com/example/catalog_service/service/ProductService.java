package com.example.catalog_service.service;

import com.example.catalog_service.domain.Product;
import com.example.catalog_service.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository repo;

    public ProductService(ProductRepository repo) { this.repo = repo; }

    public Flux<Product> list() { return repo.findAll(); }
    public Mono<Product> find(Long id) { return repo.findById(id); }
}