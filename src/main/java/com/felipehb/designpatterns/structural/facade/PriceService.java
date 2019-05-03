package com.felipehb.designpatterns.structural.facade;

public class PriceService {

    public double calculateTotalPriceForOrder(Product product, Delivery delivery) {
        return product.getPrice()+delivery.getDeliveryCost();

    }
}
