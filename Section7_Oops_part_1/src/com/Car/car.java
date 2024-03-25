package com.Car;
// making a car
//for creating a setter in the class we use this keyword
// this is a special keyword which refers itself in the program
public class car {
//    after running the code default
//    now we should add some values in it
    private String make = "bmw";
    private String model = "bmw x4";
    private String color = "alphane white";
    private int doors = 4;
    private boolean convertable = true;

//    get form are all getters just getting the values from defined private classes


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors(int i) {
        return doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    //    this is a getter
    public String getMake(){
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }


//    here describe car is the main function that prints the output this is the output for the
//    created private classes
    public void describeCar(){
        System.out.println(doors + " doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertable? "convertible" : " "));
    }
}
