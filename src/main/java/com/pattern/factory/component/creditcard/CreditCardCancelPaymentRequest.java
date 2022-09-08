package com.pattern.factory.component.creditcard;

import com.pattern.factory.component.PaymentCancelRequest;
import com.pattern.factory.component.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardCancelPaymentRequest implements PaymentCancelRequest {
    @Getter
    @Setter
    private String id;
    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
