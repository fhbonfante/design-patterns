package com.felipehb.designpatterns.behavioral.strategy;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ClientCompressionDemo {

    public static void main(String[] args) throws IOException {
        CompressionContext ctx = new CompressionContext();

        ctx.setStrategy(new ZipCompressionStrategy());

        ctx.createArchive(Arrays.asList(File.createTempFile("test","txt")));
    }
}
