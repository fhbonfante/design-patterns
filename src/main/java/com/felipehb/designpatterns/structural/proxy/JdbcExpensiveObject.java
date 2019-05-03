package com.felipehb.designpatterns.structural.proxy;

public class JdbcExpensiveObject implements ExpensiveObject {

    public JdbcExpensiveObject() {
        openJdbcConnection();
    }

    private void openJdbcConnection() {
        try {
            System.out.println("Openning jdbc connection");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); //don't do this at home
        }
    }

    @Override
    public void process() {
        System.out.println("Processing jdbc call");
    }
}
