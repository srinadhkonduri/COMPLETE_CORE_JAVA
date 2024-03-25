package com.OopMasterChallange;
public class Item {
//    first create all four classes in the required fields
    private String type;
    private String name;
    private double price;
    private String size = "medium";

//    now let's create a constructor for these four fields

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }
//    now we are creating getters for the fields name and price

    public String getName() {
        if (type.equals("side") || type.equals("drink")){
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

//    creating an own method which calls the price of the burger
    public double getAdjustedPrice(){
        return switch (size){
            case "small" -> getBasePrice() - 0.5;
            case "large" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

//    calling a setter which sets the price of the burger

    public void setSize(String size) {
        this.size = size;
    }

    public static void priceItem(String name, double price){
        System.out.printf("%20s:%6.2f%n",name,price);
    }

    public void printItem(){
        priceItem(getName(),getAdjustedPrice());
    }
}
