package com.felipehb.designpatterns.behavioral.observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsChannel implements Channel {

    private String news;

    @Override
    public void update(Object news) {
        System.out.println("Receiving news: "+news);
        this.setNews((String) news);
    }
}
