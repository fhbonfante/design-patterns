package com.felipehb.designpatterns.structural.facade;

public class StockService {

    public void doSomeStockStuff(Product product) {
        System.out.println("Doing some stock stuff for product "+product.getName());
    }
}
