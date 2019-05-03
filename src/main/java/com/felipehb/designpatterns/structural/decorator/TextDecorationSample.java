package com.felipehb.designpatterns.structural.decorator;

public class TextDecorationSample {

    public static void main(String[] args) {
        TextContent defaultText = new StandardText("hello world!");
        TextContent upperCaseText = new UpperCaseText(defaultText);
        TextContent trimmedText = new NoSpacesText(defaultText);
        TextContent upperCaseTrimmedText = new UpperCaseText(new NoSpacesText(new StandardText("text  with  some  spaces")));

        System.out.println(defaultText.getTextContent());
        System.out.println(upperCaseText.getTextContent());
        System.out.println(trimmedText.getTextContent());
        System.out.println(upperCaseTrimmedText.getTextContent());
    }
}
