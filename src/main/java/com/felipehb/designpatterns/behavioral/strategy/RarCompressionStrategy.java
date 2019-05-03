package com.felipehb.designpatterns.behavioral.strategy;

import java.io.File;
import java.util.List;

public class RarCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFiles(List<File> files) {
        System.out.println("Compressing to rar");
    }

}
