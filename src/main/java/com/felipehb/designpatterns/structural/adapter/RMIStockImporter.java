package com.felipehb.designpatterns.structural.adapter;

public class RMIStockImporter {

    public RMIStockData readStockFromRemoteServer() {
        return new RMIStockData("RMI Stock data");
    }
}
