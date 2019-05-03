package com.felipehb.designpatterns.structural.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "Rectangle "+color.fillColor();
    }
}
