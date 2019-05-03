package com.felipehb.designpatterns.structural.adapter;

public class StockDataAdapter {

    private RMIStockImporter rmiStockImporter;

    public StockDataAdapter(final RMIStockImporter rmiStockImporter) {
        this.rmiStockImporter = rmiStockImporter;
    }

    public StockData readStockData() {
        RMIStockData result = rmiStockImporter.readStockFromRemoteServer();
        return convertResult(result);
    }

    private StockData convertResult(RMIStockData result) {
        return new StockData(result.getStockContent());
    }

}
