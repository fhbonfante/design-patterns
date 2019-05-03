package com.felipehb.designpatterns.creational.prototype;

public class SingleCellOrganism extends Cell {


    @Override
    public Cell split() {
        return new SingleCellOrganism();
    }

    @Override
    public int getNumberOfCells() {
        return 1;
    }
}
