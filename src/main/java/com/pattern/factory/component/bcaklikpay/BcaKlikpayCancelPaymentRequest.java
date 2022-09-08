package com.pattern.factory.component.bcaklikpay;

import com.pattern.factory.component.PaymentCancelRequest;
import com.pattern.factory.component.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaKlikpayCancelPaymentRequest implements PaymentCancelRequest {
    @Getter
    @Setter
    private String id;
    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
