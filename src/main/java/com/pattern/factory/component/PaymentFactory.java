package com.pattern.factory.component;

public interface PaymentFactory {
    PaymentChargeRequest createChargeRequest();
    PaymentCancelRequest createCancelRequest();
    GetBalancePaymentRequest createGetBalanceRequest();
}
