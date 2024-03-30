package com.GroceryItrm;

import java.util.ArrayList;

//creating a record class in the code
record GroceryItem(String name,String type, int count){
    public GroceryItem(String name){
        this(name,"dairy".toUpperCase(),1);
    }
}
public class mainClass {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","product",5);
//        System.out.println(groceryArray[0]);
//        System.out.println(groceryArray[1]);
//        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter","dairy",9));
        objectList.add(new GroceryItem("milk"));
//        System.out.println(objectList);

//        creating an actual parameterized arraylist
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter","dairy",9));
        groceryList.add(new GroceryItem("milk","product",3));
        System.out.println(groceryList);
    }

}
