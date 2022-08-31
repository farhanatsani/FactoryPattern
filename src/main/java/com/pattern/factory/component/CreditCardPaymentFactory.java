package com.pattern.factory.component;

import com.pattern.factory.component.creditcard.CreditCardCancelPaymentRequest;
import com.pattern.factory.component.creditcard.CreditCardChargePaymentRequest;
import com.pattern.factory.component.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public PaymentChargeRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public PaymentCancelRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
//        throw new UnsupportedOperationException("");
        return new CreditCardGetBalancePaymentRequest();
    }
}
