package com.example.catalog_service.repository;

import com.example.catalog_service.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository {

    private final Map<String, Product> products = new HashMap<>();

    public ProductRepository() {
        products.put("1", new Product("1", "Notebook", 25000.0, 10));
        products.put("2", new Product("2", "Mouse", 800.0, 50));
        products.put("3", new Product("3", "Teclado", 1200.0, 30));
    }

    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    public Product findById(String id) {
        return products.get(id);
    }
}