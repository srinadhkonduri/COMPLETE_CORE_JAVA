package com.OopMasterChallange;

public class Burger extends Item{
//    create 3 fields called extra items
    private Item extra1;
    private Item extra2;
    private Item extra3;

//    create a constructor with the option select none
    public Burger(String name, double price) {
        super("burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + "burger";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getAdjustedPrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String topping){
        return switch (topping.toUpperCase()){
            case "avocado" ,"cheese" -> 1.0;
            case "bacon","han","salahi" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1,String extra2,String extra3){
        this.extra1 = new Item("topping",extra1,getExtraPrice(extra1));
        this.extra2 = new Item("topping",extra2,getExtraPrice(extra2));
        this.extra3 = new Item("topping",extra3,getExtraPrice(extra3));
    }
}
