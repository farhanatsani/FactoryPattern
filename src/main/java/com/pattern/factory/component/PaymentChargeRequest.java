package com.pattern.factory.component;

public interface PaymentChargeRequest {
    String getId();
    void setId(String id);
    String getUserId();
    void setUserId(String userId);
    void setAmount(Long amount);
    Long getAmount();
    Long getFee();
    PaymentMethod getMethod();
}
