package com.felipehb.designpatterns.creational.abstractfactory;

public class ArtRequest {

    public static void main(String[] args) {
        AbstractArtFactory classicArtFactory = new ClassicArtFactory();
        AbstractArtFactory modernArtFactory = new ModernArtFactory();

        AbstractPainting modernPainting = requestModernPainting();
        AbstractPainting classicPainting = requestClassicPainting();
        AbstractDrawing modernDrawing = requestModernDrawing();
        AbstractDrawing classicDrawing = requestClassicDrawing();

        System.out.println(modernPainting.getStyle());
        System.out.println(classicPainting.getStyle());
        System.out.println(modernDrawing.getStyle());
        System.out.println(classicDrawing.getStyle());
    }

    private static AbstractDrawing requestClassicDrawing() {
        return new ClassicArtFactory().createDrawing();
    }

    private static AbstractDrawing requestModernDrawing() {
        return new ModernArtFactory().createDrawing();
    }

    private static AbstractPainting requestClassicPainting() {
        return new ClassicArtFactory().createPainting();
    }

    private static AbstractPainting requestModernPainting() {
        return new ModernArtFactory().createPainting();
    }
}
