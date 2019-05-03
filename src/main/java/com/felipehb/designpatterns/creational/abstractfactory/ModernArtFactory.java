package com.felipehb.designpatterns.creational.abstractfactory;

public class ModernArtFactory implements AbstractArtFactory {

    @Override
    public AbstractPainting createPainting() {
        return new ModernPainting();
    }

    @Override
    public AbstractDrawing createDrawing() {
        return new ModernDrawing();
    }

}
