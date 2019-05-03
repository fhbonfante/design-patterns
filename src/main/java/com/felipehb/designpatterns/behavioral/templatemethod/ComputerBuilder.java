package com.felipehb.designpatterns.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ComputerBuilder {

    public final Computer buildComputer() {
        List<ComputerParts> computerParts = new ArrayList<>();
        computerParts.add(addMotherboard());
        computerParts.add(setupMotherboard());
        computerParts.add(addProcessor());
        return new Computer(computerParts);
    }

    public abstract ComputerParts addMotherboard();
    public abstract ComputerParts setupMotherboard();
    public abstract ComputerParts addProcessor();
}
