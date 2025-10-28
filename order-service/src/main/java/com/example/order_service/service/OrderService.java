package com.example.order_service.service;

import com.example.order_service.client.CatalogClient;
import com.example.order_service.domain.OrderRequest;
import com.example.order_service.domain.OrderResponse;
import com.example.order_service.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final CatalogClient catalogClient;

    public OrderService(CatalogClient catalogClient) {
        this.catalogClient = catalogClient;
    }

    public OrderResponse createOrder(OrderRequest request) {
        Product product = catalogClient.getProduct(request.getProductId());

        if (product == null) {
            return new OrderResponse("Produto não encontrado", 0);
        }

        double total = product.getPrice() * request.getQuantity();
        return new OrderResponse("Pedido criado com sucesso!", total);
    }
}