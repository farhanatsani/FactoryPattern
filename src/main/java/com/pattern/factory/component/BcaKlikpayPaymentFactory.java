package com.pattern.factory.component;

import com.pattern.factory.component.bcaklikpay.BcaKlikpayCancelPaymentRequest;
import com.pattern.factory.component.bcaklikpay.BcaKlikpayChargePaymentRequest;
import com.pattern.factory.component.bcaklikpay.BcaKlikpayGetBalancePaymentRequest;
import org.springframework.stereotype.Component;

@Component
public class BcaKlikpayPaymentFactory implements PaymentFactory {
    @Override
    public PaymentChargeRequest createChargeRequest() {
        return new BcaKlikpayChargePaymentRequest();
    }

    @Override
    public PaymentCancelRequest createCancelRequest() {
        return new BcaKlikpayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BcaKlikpayGetBalancePaymentRequest();
    }
}
