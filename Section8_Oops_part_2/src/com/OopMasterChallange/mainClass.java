package com.OopMasterChallange;

public class mainClass {
    public static void main(String[] args) {
        Item coke = new Item("drink","coke",1.50);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();

        Item avocado = new Item("topping","avocada",1.60);
        avocado.printItem();

        Burger burger = new Burger("regular",4.00);
        burger.addToppings("bacon","cheese","han");
        burger.printItem();
    }
}
