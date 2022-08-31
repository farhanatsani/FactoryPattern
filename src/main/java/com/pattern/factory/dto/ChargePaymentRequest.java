package com.pattern.factory.dto;

import com.pattern.factory.component.PaymentMethod;
import lombok.Data;

@Data
public class ChargePaymentRequest {
    private String phoneNo;
    private PaymentMethod paymentMethod;
    private Long amount;
}
