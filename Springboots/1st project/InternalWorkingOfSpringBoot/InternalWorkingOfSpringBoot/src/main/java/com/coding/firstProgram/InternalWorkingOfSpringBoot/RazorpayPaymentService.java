package com.coding.firstProgram.InternalWorkingOfSpringBoot;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="payment.provider",havingValue="rozerpay")
public class RazorpayPaymentService implements PaymentService {

    @Override
 public String pay(){
     String payment= "Razorpay Payment";
     System.out.println("Payment from : "+ payment);
     return payment;


 }




}
