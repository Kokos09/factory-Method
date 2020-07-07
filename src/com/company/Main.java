package com.company;

import com.company.creational.factory.Payment;
import com.company.creational.factory.PaymentFactory;
import com.company.creational.factory.TypePayment;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pagando con Tarjeta de Credito");
        test();

    }
    private static void test(){
        Payment payment= PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
