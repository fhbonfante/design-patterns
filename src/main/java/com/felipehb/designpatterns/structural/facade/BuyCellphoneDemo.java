package com.felipehb.designpatterns.structural.facade;

public class BuyCellphoneDemo {

    public static void main(String[] args) {
        BuyFacade buyFacade = new CellphoneBuyFacade();
        Order orderedCellphone = buyFacade.buyProduct(new Product("Cellphone",500d));
        System.out.println(orderedCellphone.getProduct().getName());
        System.out.println(orderedCellphone.getProduct().getPrice());
        System.out.println(orderedCellphone.getTotalPrice());
    }
}
