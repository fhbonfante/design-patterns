package com.felipehb.designpatterns.creational.builder;

public class PizzaRequest {

    public static void main(String[] args) {
        Attendant attendant = new Attendant();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        attendant.setPizzaBuilder( spicyPizzaBuilder );
        attendant.constructPizza();

        Pizza pizza = attendant.getPizza();

        System.out.println(pizza.getDough());
        System.out.println(pizza.getSauce());
        System.out.println(pizza.getTopping());
    }
}
