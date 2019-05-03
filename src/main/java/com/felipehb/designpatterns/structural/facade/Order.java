package com.felipehb.designpatterns.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {
    private Product product;
    private double totalPrice;
}
