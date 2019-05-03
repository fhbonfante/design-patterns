package com.felipehb.designpatterns.creational.abstractfactory;

public class ClassicArtFactory implements AbstractArtFactory {

    @Override
    public AbstractPainting createPainting() {
        return new ClassicPainting();
    }

    @Override
    public AbstractDrawing createDrawing() {
        return new ClassicDrawing();
    }

}
