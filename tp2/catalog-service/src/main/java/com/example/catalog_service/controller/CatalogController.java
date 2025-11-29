package com.example.catalog_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class CatalogController {

    @GetMapping("/catalog")
    public List<Map<String, Object>> getCatalog() {
        return List.of(
                Map.of("id", 1, "name", "Notebook", "price", 35000),
                Map.of("id", 2, "name", "Mouse", "price", 800),
                Map.of("id", 3, "name", "Teclado", "price", 1200)
        );
    }
}