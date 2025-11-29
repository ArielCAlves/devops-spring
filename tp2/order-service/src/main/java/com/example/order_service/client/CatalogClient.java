package com.example.order_service.client;

import com.example.order_service.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service", url = "http://localhost:8081")
public interface CatalogClient {

    @GetMapping("/api/products/{id}")
    Product getProduct(@PathVariable("id") String id);
}