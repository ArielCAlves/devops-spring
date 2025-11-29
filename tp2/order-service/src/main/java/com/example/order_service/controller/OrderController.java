package com.example.order_service.controller;

import com.example.order_service.client.CatalogClient;
import com.example.order_service.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class OrderController {

    private final CatalogClient catalogClient;

    public OrderController(CatalogClient catalogClient) {
        this.catalogClient = catalogClient;
    }

    @GetMapping("/orders")
    public Map<String, Object> createOrder(@RequestParam String id) {
        Product product = catalogClient.getProduct(id);

        return Map.of(
                "orderId", 1,
                "status", "CREATED",
                "product", product
        );
    }
}