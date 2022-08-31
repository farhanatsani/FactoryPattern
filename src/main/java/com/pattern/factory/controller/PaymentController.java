package com.pattern.factory.controller;

import com.pattern.factory.component.*;
import com.pattern.factory.dto.ChargePaymentRequest;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PaymentController {

    private final PaymentOption paymentOption;

    @PostMapping(value = "/api/payments")
    public ResponseEntity<?> chargePayment(@RequestBody ChargePaymentRequest chargePaymentRequest) {
        PaymentFactory payment = paymentOption.getPayment(chargePaymentRequest.getPaymentMethod());

        PaymentChargeRequest paymentChargeRequest = payment.createChargeRequest();
        paymentChargeRequest.setId("12345");
        paymentChargeRequest.setAmount(100000L);

        // Payment Gateway
        payment.createChargeRequest();

        return ResponseEntity.ok("Success");
    }

    @DeleteMapping(value = "/api/payments/{id}")
    public ResponseEntity<?> cancelPayment(@PathVariable String id) {
        return null;
    }

    @GetMapping(value = "/api/payments/{phoneNo}")
    public ResponseEntity<?> getBalance(String phoneNo) {
        return null;
    }
}
