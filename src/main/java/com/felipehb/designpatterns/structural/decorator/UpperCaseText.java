package com.felipehb.designpatterns.structural.decorator;

public class UpperCaseText implements TextContent {

    private TextContent decorated;

    public UpperCaseText(TextContent textContent) {
        this.decorated = textContent;
    }

    @Override
    public String getTextContent() {
        return decorated.getTextContent().toUpperCase();
    }
}
