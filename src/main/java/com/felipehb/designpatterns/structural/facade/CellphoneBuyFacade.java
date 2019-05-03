package com.felipehb.designpatterns.structural.facade;

public class CellphoneBuyFacade implements BuyFacade {
    private StockService stockService;
    private PriceService priceService;
    private DeliveryService deliveryService;

    public CellphoneBuyFacade() {
        this.stockService = new StockService();
        this.priceService = new PriceService();
        this.deliveryService = new DeliveryService();
    }

    @Override
    public Order buyProduct(Product product) {
        stockService.doSomeStockStuff(product);
        Delivery delivery = deliveryService.getDeliveryForProduct(product);
        double totalPrice = priceService.calculateTotalPriceForOrder(product,delivery);
        return new Order(product,totalPrice);
    }
}
