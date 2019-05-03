package com.felipehb.designpatterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
