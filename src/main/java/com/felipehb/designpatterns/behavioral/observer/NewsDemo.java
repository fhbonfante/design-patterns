package com.felipehb.designpatterns.behavioral.observer;

public class NewsDemo {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Channel newsChannel1 = new NewsChannel();
        Channel newsChannel2 = new NewsChannel();

        agency.addObserver(newsChannel1);
        agency.addObserver(newsChannel2);
        agency.setNews("Blasting news!!!");

        agency.removeObserver(newsChannel2);
        agency.setNews("Urgent news!!!");

    }

}
