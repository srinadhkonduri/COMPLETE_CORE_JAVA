package com.Car;

// ENCAPSULATION = Encapsulation in Java is a process of wrapping code and data together
// into a single unit, for example, a capsule which is mixed of several medicines.


// a method can be called from any class that we created but should be in
//the same package or folder
// for calling the object in the class we need create an object from the
//created class
//default values in java boolean = false
//all data types = 0 float = 0.0
//        System.out.println("make = " + car.make);
//        we cannot directly access the functions or methods created
//        by another class but, we can call the class from function created
//        we cannot access the methods created directly
//        we can access through getters and setters
//        A getter is a method on a class that retrieves the value
//        of a private field and returns it
//        A setter is a method on a class that sets the value of a private field
//        for accessing the methods without containing static fields we should create getters
public class main {
    public static void main(String[] args) {
//        this sentence below the line is called the creation of object
        car car = new car();
//        here getMake is a getter
        System.out.println("make = " + car.getMake());
        System.out.println("mode = " + car.getModel());
        System.out.println("convertible = " + car.isConvertable());
//        calling setters = setting a updated value to the car class in it
        car.setColor("blue");
        car.setMake("bmw");
        car.getDoors(4);
        car.describeCar();


//        here we are creating a new car called bmw
//        in this way we can create number of cars by using one class which is called encapsulation

        car bmw = new car();
        bmw.setColor("white");
        bmw.setMake("bmww");
        bmw.getDoors(3);
        System.out.println("make = " + bmw.getMake());
        System.out.println("mode = " + bmw.getModel());
        System.out.println("convertible = " + bmw.isConvertable());
        bmw.describeCar();

    }
}
