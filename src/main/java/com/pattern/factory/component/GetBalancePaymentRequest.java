package com.pattern.factory.component;

public interface GetBalancePaymentRequest {
    String getUserId();
    void setUserId(String userId);
    PaymentMethod getMethod();
}
