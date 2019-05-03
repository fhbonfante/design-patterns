package com.felipehb.designpatterns.structural.proxy;

public class QueryExpensiveObject implements ExpensiveObject {

    private ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null) {
            expensiveObject = new JdbcExpensiveObject();
        }

        expensiveObject.process();
    }
}
