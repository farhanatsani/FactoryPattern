package com.pattern.factory.component.gopay;

import com.pattern.factory.component.GetBalancePaymentRequest;
import com.pattern.factory.component.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayGetBalancePaymentRequest implements GetBalancePaymentRequest {
    @Getter
    @Setter
    private String userId;
    @Getter
    @Setter
    private Long balance;
    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
