package com.pattern.factory.component;

import com.pattern.factory.component.gopay.GopayCancelPaymentRequest;
import com.pattern.factory.component.gopay.GopayChargePaymentRequest;
import com.pattern.factory.component.gopay.GopayGetBalancePaymentRequest;
import org.springframework.stereotype.Component;

@Component
public class GopayPaymentFactory implements PaymentFactory {
    @Override
    public PaymentChargeRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public PaymentCancelRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
