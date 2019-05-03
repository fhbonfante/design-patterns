package com.felipehb.designpatterns.behavioral.visitor;

public class JsonElement implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }
}
