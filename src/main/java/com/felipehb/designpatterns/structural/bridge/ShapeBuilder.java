package com.felipehb.designpatterns.structural.bridge;

public class ShapeBuilder {

    public static void main(String[] args) {
        Shape redRectangle = new Rectangle(new Red());
        Shape blueRectangle = new Rectangle(new Blue());
        Shape redCircle = new Circle(new Red());
        Shape blueCircle = new Circle(new Blue());

        System.out.println(redRectangle.draw());
        System.out.println(blueRectangle.draw());
        System.out.println(redCircle.draw());
        System.out.println(blueCircle.draw());

    }
}
