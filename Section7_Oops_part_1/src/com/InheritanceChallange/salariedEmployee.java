package com.InheritanceChallange;

public class salariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public salariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    public double collectPay() {
        double payCheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;
        return (int) adjustedPay;
    }
    public void retired(){
        terminate("12/12/2024");
        isRetired = true;
    }
}
