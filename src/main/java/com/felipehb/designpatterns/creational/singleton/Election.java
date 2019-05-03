package com.felipehb.designpatterns.creational.singleton;

public class Election {

    public static void main(String[] args) {
        System.out.println(Government.getInstance().election());
    }
}
