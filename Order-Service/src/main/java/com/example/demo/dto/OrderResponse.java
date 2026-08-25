package com.example.demo.dto;

public class OrderResponse {

    private Long orderId;
    private String userName;
    private String productName;
    private double price;

    public OrderResponse() {
    }

    public OrderResponse(Long orderId, String userName, String productName, double price) {
        this.orderId = orderId;
        this.userName = userName;
        this.productName = productName;
        this.price = price;
    }

    // Getters
    public Long getOrderId() {
        return orderId;
    }

    public String getUserName() {
        return userName;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}