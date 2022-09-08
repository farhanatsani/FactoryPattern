package com.pattern.factory.component;

public interface PaymentCancelRequest {
    String getId();
    void setId(String id);
    PaymentMethod getMethod();
}
