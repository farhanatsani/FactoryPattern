package com.pattern.factory.component.bcaklikpay;

import com.pattern.factory.component.PaymentChargeRequest;
import com.pattern.factory.component.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaKlikpayChargePaymentRequest implements PaymentChargeRequest {
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
        return 5000L;
    }
    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
