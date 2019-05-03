package com.felipehb.designpatterns.behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.List;

@Getter
@Setter
public class CompressionContext {

    private CompressionStrategy strategy;

    public void createArchive(List<File> files) {
        strategy.compressFiles(files);
    }
}
