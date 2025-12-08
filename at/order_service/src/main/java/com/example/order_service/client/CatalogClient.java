package com.example.order_service.client;

import com.example.order_service.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class CatalogClient {

    private final WebClient client;

    public CatalogClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8081").build();
    }

    public Mono<ProductDTO> getProduct(Long id) {
        return client.get()
                .uri("/products/" + id)
                .retrieve()
                .bodyToMono(ProductDTO.class);
    }
}