package com.example.tp3_order_service.order;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderClient client;

    public OrderController(OrderClient client) {
        this.client = client;
    }

    @GetMapping("/{id}")
    public Mono<OrderRecord> create(@PathVariable Long id) {
        return client.getProduct(id)
                .map(p -> new OrderRecord(id, p.name(), p.price()));
    }
}