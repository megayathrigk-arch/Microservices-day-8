package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserClient;
import com.example.demo.dto.OrderResponse;
import com.example.demo.dto.PaymentResponse;
import com.example.demo.dto.UserDto;
import com.example.demo.service.OrderService;
import com.example.demo.service.PaymentClient;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;
    private final PaymentClient paymentClient;
    private final UserClient userClient;

    public OrderController(OrderService orderService,
                           PaymentClient paymentClient,
                           UserClient userClient) {
        this.orderService = orderService;
        this.paymentClient = paymentClient;
        this.userClient = userClient;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOrder(@PathVariable Long id) {

        OrderResponse response = orderService.getOrder(id);

        if (response == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}/payment")
    public PaymentResponse getPayment(@PathVariable Long id) {

        return paymentClient.makePayment(id);
    }

    @GetMapping("/{id}/user")
    public String getOrderUser(@PathVariable Long id) {

        UserDto user = userClient.getUserById(id);

        return "User Name : " + user.getName();
    }
}