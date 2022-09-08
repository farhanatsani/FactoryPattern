package com.pattern.factory.controller;

import com.pattern.factory.component.*;
import com.pattern.factory.dto.ChargePaymentRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PaymentController {

    private final PaymentOption paymentOption;

    @PostMapping(value = "/api/payments")
    public ResponseEntity<?> chargePayment(@RequestBody ChargePaymentRequest chargePaymentRequest) {
        PaymentFactory payment = paymentOption.getPayment(chargePaymentRequest.getPaymentMethod());

        // Payment Gateway
        PaymentChargeRequest paymentChargeRequest = payment.createChargeRequest();
        paymentChargeRequest.setId("12345");
        paymentChargeRequest.setAmount(chargePaymentRequest.getAmount());

        return ResponseEntity.ok("Success Charge Payment " + chargePaymentRequest.getPaymentMethod().name() +
                " amount Rp. " + chargePaymentRequest.getAmount() + ". Id : " + paymentChargeRequest.getId());
    }

    @DeleteMapping(value = "/api/payments/{id}")
    public ResponseEntity<?> cancelPayment(@PathVariable String id) {

        // This is should from database, get Id from table
        PaymentMethod hardcodedPaymentMethod = PaymentMethod.GOPAY;

        // Payment Gateway
        PaymentFactory payment = paymentOption.getPayment(hardcodedPaymentMethod);
        PaymentCancelRequest paymentCancelRequest = payment.createCancelRequest();
        paymentCancelRequest.setId(id);

        return ResponseEntity.ok("Success cancel payment Id : " + id);
    }

    @GetMapping(value = "/api/balances/{phoneNo}")
    public ResponseEntity<?> getBalance(String phoneNo) {

        // This is should from database, get Id from table
        PaymentMethod hardcodedPaymentMethod = PaymentMethod.GOPAY;

        PaymentFactory payment = paymentOption.getPayment(hardcodedPaymentMethod);
        GetBalancePaymentRequest balancePaymentRequest = payment.createGetBalanceRequest();
        balancePaymentRequest.setUserId(phoneNo);

        // Payment Gateway
        GetBalancePaymentRequest balanceRequest = payment.createGetBalanceRequest();
        balanceRequest.setBalance(1000L);

        // Get Response Balance
        Long balance = balanceRequest.getBalance();

        return ResponseEntity.ok("Success Get Balance Rp." + balance);
    }
}
