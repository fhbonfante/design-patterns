package com.felipehb.designpatterns.creational.factorymethod;

public class Truck implements Transport {

    @Override
    public String deliver() {
        return "Delivering on road";
    }

}
