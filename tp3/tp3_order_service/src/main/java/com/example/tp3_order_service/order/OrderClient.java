package com.example.tp3_order_service.order;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class OrderClient {

    private final WebClient client;

    public OrderClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8081").build();
    }

    public Mono<ProductDTO> getProduct(Long id) {
        return client.get()
                .uri("/products/" + id)
                .retrieve()
                .bodyToMono(ProductDTO.class);
    }
}