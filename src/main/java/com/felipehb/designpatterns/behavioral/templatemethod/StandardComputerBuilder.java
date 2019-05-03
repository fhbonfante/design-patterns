package com.felipehb.designpatterns.behavioral.templatemethod;

public class StandardComputerBuilder extends ComputerBuilder {
    @Override
    public ComputerParts addMotherboard() {
        return new ComputerParts("Standard Mother Board");
    }

    @Override
    public ComputerParts setupMotherboard() {
        return new ComputerParts("Standard Setup");
    }

    @Override
    public ComputerParts addProcessor() {
        return new ComputerParts("I3");
    }
}
