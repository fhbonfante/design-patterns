package com.felipehb.designpatterns.structural.adapter;

public class CloudStockImporter {

    public StockData readStockFromCloud() {
        return new StockData("Cloud Stock data");
    }
}
