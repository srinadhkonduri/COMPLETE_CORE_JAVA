package com.Inheritence;

public class Animal {
    private String type;
    private String size;
    private String weight;
//    creating an empty constructor that runs the animal class
    public Animal(){

    }

//    on line 10 these are called constructors

    public Animal(String type, String size, String weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void move(String speed){
        System.out.println(type + "moves" + speed);
    }

    public void makeNoise(){
        System.out.println(type + "make some kind of noise");
    }
}
