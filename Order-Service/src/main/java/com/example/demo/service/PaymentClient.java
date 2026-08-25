package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.PaymentResponse;

@Service
public class PaymentClient {

    private final RestTemplate restTemplate;

    @Value("${payment.service.url}")
    private String paymentUrl;

    public PaymentClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Retryable(maxAttempts = 3)
    public PaymentResponse makePayment(Long orderId) {

        System.out.println("Calling Payment Service");

        return restTemplate.getForObject(
                paymentUrl + "/payments/" + orderId,
                PaymentResponse.class
        );
    }

    public PaymentResponse fallbackPayment(
            Long orderId,
            Exception ex) {

        return new PaymentResponse(
                orderId,
                "Circuit Breaker Activated"
        );
    }
}