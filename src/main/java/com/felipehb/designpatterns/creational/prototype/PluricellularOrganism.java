package com.felipehb.designpatterns.creational.prototype;

public class PluricellularOrganism extends Cell {

    private int numberOfCells;

    public PluricellularOrganism(int numberOfCells) {
        this.numberOfCells = numberOfCells;
    }

    @Override
    public int getNumberOfCells() {
        return numberOfCells;
    }

    @Override
    public Cell split() {
        return new PluricellularOrganism(this.numberOfCells);
    }


}
