package com.ConstructorChallange;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

//    creating a constructor chaining
    public Customer(){
//        this statement in this line is called constructor chaining
        this("srinadh",1000);
    }


//    creating another constructors with two parameters
    public Customer(String name, double creditLimit) {
        this(name,creditLimit,"srinadh@gmail.com");
    }

    //    creating constructors for the classes
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //    creating getters methods for the three classes
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
