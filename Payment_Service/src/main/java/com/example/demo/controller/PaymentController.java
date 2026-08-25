package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @GetMapping("/{id}")
    public String getPayment(@PathVariable Long id) {
        return "Payment " + id + " processed";
    }
}