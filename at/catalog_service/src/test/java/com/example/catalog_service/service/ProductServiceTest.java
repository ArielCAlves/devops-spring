package com.example.catalog_service.service;

import com.example.catalog_service.domain.Product;
import com.example.catalog_service.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import org.mockito.Mockito;

class ProductServiceTest {

    ProductRepository repo = Mockito.mock(ProductRepository.class);
    ProductService service = new ProductService(repo);

    @Test
    void testList() {
        Mockito.when(repo.findAll())
                .thenReturn(Flux.just(new Product(1L, "A", 10.0)));

        StepVerifier.create(service.list())
                .expectNextMatches(p -> p.name().equals("A"))
                .verifyComplete();
    }

    @Test
    void testFind() {
        Mockito.when(repo.findById(1L))
                .thenReturn(Mono.just(new Product(1L, "B", 20.0)));

        StepVerifier.create(service.find(1L))
                .expectNextMatches(p -> p.name().equals("B"))
                .verifyComplete();
    }
}