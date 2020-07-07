package com.company.creational.factory;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case CARD:
                return new CardPayment() ;
            case GOOGLEPAYMENT:
                return  new CreditCard();
            default:
                return  new CardPayment();
        }
    }
}
