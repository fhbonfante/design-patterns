package com.felipehb.designpatterns.creational.factorymethod;

public class RoadLogistics implements Logistics {

    @Override
    public Transport makeTransport() {
        return new Truck();
    }

}
