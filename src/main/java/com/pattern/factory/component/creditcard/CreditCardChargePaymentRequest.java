package com.pattern.factory.component.creditcard;

import com.pattern.factory.component.PaymentChargeRequest;
import com.pattern.factory.component.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardChargePaymentRequest implements PaymentChargeRequest {
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String userId;
    @Getter
    @Setter
    private Long amount;
    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }
    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
