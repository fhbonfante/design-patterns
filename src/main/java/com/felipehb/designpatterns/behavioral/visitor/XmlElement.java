package com.felipehb.designpatterns.behavioral.visitor;

public class XmlElement implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }
}
