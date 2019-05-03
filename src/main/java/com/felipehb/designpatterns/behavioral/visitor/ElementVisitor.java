package com.felipehb.designpatterns.behavioral.visitor;

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XmlElement xe) {
        System.out.println("processing xml element");
    }

    @Override
    public void visit(JsonElement je) {
        System.out.println("processing json element");
    }
}
