package com.felipehb.designpatterns.behavioral.templatemethod;

public class BuildComputerDemo {

    public static void main(String[] args) {
        ComputerBuilder builder = new StandardComputerBuilder();
        //ComputerBuilder builder = new GamerComputerBuilder();
        Computer computer = builder.buildComputer();
        System.out.println(computer.getComputerParts().stream().map(ComputerParts::getName).reduce((x,y) -> x+", "+y));
    }
}
