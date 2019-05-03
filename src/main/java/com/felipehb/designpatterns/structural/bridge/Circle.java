package com.felipehb.designpatterns.structural.bridge;

public class Circle extends Shape {

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "Circle "+color.fillColor();
    }
}
