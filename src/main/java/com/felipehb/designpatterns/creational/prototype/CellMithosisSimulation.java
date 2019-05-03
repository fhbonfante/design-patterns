package com.felipehb.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CellMithosisSimulation {

    public static void main(String[] args) {
        List<Cell> cells = new ArrayList<>();
        cells.addAll(createSingleCellOrganisms());
        cells.addAll(createPluricellularOrganisms());
        List<Integer> numberOfCells = cells.stream().map(Cell::getNumberOfCells).collect(Collectors.toList());

        List<Cell> splitedCells = cells.stream().map(Cell::split).collect(Collectors.toList());
        List<Integer> numberOfCellsAfterSpliting = splitedCells.stream().map(Cell::getNumberOfCells).collect(Collectors.toList());
        System.out.println(numberOfCells.equals(numberOfCellsAfterSpliting));
    }

    private static List<Cell> createPluricellularOrganisms() {
        return IntStream.range(0,10).mapToObj(i -> new PluricellularOrganism(i)).collect(Collectors.toList());
    }

    private static List<Cell> createSingleCellOrganisms() {
        return IntStream.range(0,10).mapToObj(i -> new SingleCellOrganism()).collect(Collectors.toList());
    }
}
