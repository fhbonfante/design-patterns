package com.felipehb.designpatterns.creational.factorymethod;

public class SeaLogistics implements Logistics {

    @Override
    public Transport makeTransport() {
        return new Ship();
    }

}
