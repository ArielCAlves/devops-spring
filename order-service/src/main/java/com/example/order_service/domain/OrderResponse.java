package com.example.order_service.domain;

public class OrderResponse {
    private String message;
    private double total;

    public OrderResponse(String message, double total) {
        this.message = message;
        this.total = total;
    }

    public String getMessage() { return message; }
    public double getTotal() { return total; }
}