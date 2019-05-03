package com.felipehb.designpatterns.structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StandardText implements TextContent {
    private String content;

    @Override
    public String getTextContent() {
        return content;
    }
}
