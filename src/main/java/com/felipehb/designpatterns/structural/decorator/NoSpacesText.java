package com.felipehb.designpatterns.structural.decorator;

public class NoSpacesText implements TextContent {

    private TextContent decorated;

    public NoSpacesText(TextContent textContent) {
        this.decorated = textContent;
    }


    @Override
    public String getTextContent() {
        return decorated.getTextContent().replaceAll("\\s","");
    }
}
