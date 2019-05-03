package com.felipehb.designpatterns.creational.factorymethod;

public class TransportRequest {

    public static void main(String[] args) {
        Logistics logistic = new SeaLogistics();

        Transport transport = logistic.makeTransport();

        System.out.println(transport.deliver());
    }
}
