package com.company.creational.factory;

public class CreditCard implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con Google Payment");
    }
}
