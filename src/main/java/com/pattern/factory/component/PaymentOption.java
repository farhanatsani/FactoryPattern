package com.pattern.factory.component;

import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PaymentOption {

    private final ApplicationContext applicationContext;

    @Bean
    @Scope("prototype")
    public PaymentFactory getPayment(PaymentMethod paymentMethod) {
        PaymentFactory paymentFactory = null;
        if(paymentMethod == PaymentMethod.CREDIT_CARD) {
            paymentFactory = applicationContext.getBean(CreditCardPaymentFactory.class);
        } else if(paymentMethod == PaymentMethod.BCA_KLIKPAY) {
            paymentFactory = applicationContext.getBean(BcaKlikpayPaymentFactory.class);
        } else if(paymentMethod == PaymentMethod.GOPAY) {
            paymentFactory = applicationContext.getBean(GopayPaymentFactory.class);
        } else {
            new UnsupportedOperationException("Payment Method Unsupported");
        }
        return paymentFactory;
    }

}
