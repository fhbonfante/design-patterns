package com.felipehb.designpatterns.structural.proxy;

public class JdbcMultipleAcessessSample {

    public static void main(String[] args) {
        ExpensiveObject object = new QueryExpensiveObject();
        object.process();
        object.process();
        object.process();
        object.process();
        object.process();
    }
}
