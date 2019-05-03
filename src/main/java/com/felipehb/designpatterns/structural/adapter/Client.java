package com.felipehb.designpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {
        StockProcessor stockProcessor = new StockProcessor();

        StockData cloudStockData = new CloudStockImporter().readStockFromCloud();
        StockData rmiStockData = new StockDataAdapter(new RMIStockImporter()).readStockData();

        System.out.println(stockProcessor.processStockData(cloudStockData));
        System.out.println(stockProcessor.processStockData(rmiStockData));
    }
}
