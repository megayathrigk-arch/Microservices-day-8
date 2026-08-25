package com.example.demo.dto;

public class PaymentResponse {

    private Long orderId;
    private String status;

    public PaymentResponse() {
    }

    public PaymentResponse(Long orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }

    // Getters
    public Long getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}