package com.InheritanceChallange;

public class hourlyEmployee extends Employee{
        private double hourlyPayRate;
//        now let's create a constructor

    public hourlyEmployee(String name, String birthDate,
                          String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double collectPay(){
        return 40 * hourlyPayRate;
    }
    public double getDoublePay(){
        return 2 * collectPay();
    }
}
