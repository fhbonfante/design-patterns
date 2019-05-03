package com.felipehb.designpatterns.behavioral.visitor;

import java.util.Arrays;

public class VisitorDemo {
    public static void main(String[] args) {

        Visitor v = new ElementVisitor();

        Element jsonElement = new JsonElement();
        Element xmlElement = new XmlElement();
        Document document = new Document(Arrays.asList(jsonElement,xmlElement));

        document.accept(v);
    }
}
