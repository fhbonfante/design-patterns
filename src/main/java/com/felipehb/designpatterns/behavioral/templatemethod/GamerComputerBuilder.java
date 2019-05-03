package com.felipehb.designpatterns.behavioral.templatemethod;

public class GamerComputerBuilder extends ComputerBuilder{
    @Override
    public ComputerParts addMotherboard() {
        return new ComputerParts("Asus Mother Board");
    }

    @Override
    public ComputerParts setupMotherboard() {
        return new ComputerParts("Awesome mother board setup");
    }

    @Override
    public ComputerParts addProcessor() {
        return new ComputerParts("I7");
    }
}
