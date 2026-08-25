package com.example.demo.entity;

public class Order {

    private Long orderId;
    private Long userId;
    private String product;
    private double amount;

    public Order() {
    }

    public Order(Long orderId, Long userId, String product, double amount) {
        this.orderId = orderId;
        this.userId = userId;
        this.product = product;
        this.amount = amount;
    }

    // Getters
    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    // Setters
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}