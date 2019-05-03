package com.felipehb.designpatterns.behavioral.templatemethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Computer {
    private List<ComputerParts> computerParts;

    public Computer() {
        computerParts = new ArrayList<>();
    }
}
