package com.Inheritence;
// to inherit the animal rules all to the dog we use extends
// keyword to inherit from one to another
//here animal is a parent and dog is a child
public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(String type, String size, String weight, String earShape, String tailShape) {
        super(type, size, weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public Dog(){
        super("mutt","big","50");
    }
}
