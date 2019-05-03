package com.felipehb.designpatterns.creational.abstractfactory;

public interface AbstractArtFactory {

    AbstractPainting createPainting();
    AbstractDrawing createDrawing();
}
