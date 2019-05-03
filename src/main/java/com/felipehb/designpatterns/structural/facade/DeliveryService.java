package com.felipehb.designpatterns.structural.facade;

public class DeliveryService {

    public Delivery getDeliveryForProduct(Product product) {
        return new Delivery(product.getPrice()/10);
    }
}
