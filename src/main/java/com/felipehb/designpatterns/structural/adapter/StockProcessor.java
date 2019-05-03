package com.felipehb.designpatterns.structural.adapter;

public class StockProcessor {

    public String processStockData(StockData stockData) {
        return stockData.getContent();
    }
}
