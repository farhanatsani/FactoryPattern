package com.pattern.factory.component;

public interface GetBalancePaymentRequest {
    String getUserId();
    void setUserId(String userId);
    void setBalance(Long balance);
    Long getBalance();
    PaymentMethod getMethod();
}
