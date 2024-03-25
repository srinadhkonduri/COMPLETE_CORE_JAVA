package com.ClassesChallange;
//this is  encapsulation method all methods and subtitles in one method
//constructor overloading is declaring multiple constructors with different formal parameters
public class Account {
//    for a bank user the following details are important to be created
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

// creating an empty constructor syntax
    public Account(){
        this("123456",6789.90,"srinadh","nani@gmail.com","891940");
        System.out.println("empty constructor called");
    }

//    The constructor that are created from the code contains all the parameters in one constructor
//    the constructor created must be same as the class name
    public Account(String number, double balance, String customerName,
                   String customerEmail, String customerPhone) {
        System.out.println("account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

//    creating another constructor with some different parameters


    public Account(String customerName, String customerEmail, String customerPhone) {
        this("33333",4567.89,customerName,customerEmail,customerPhone);
    }

//    creating another constructor with some another parameters


    public Account(String number, double balance) {
        this(number,balance,"nanikonduri","aduko@gmail.com","999999");
    }

    //    creating a deposit method for the bank customer
    public void depositFunds(double depositAmount){
        balance += depositAmount;
        System.out.println("deposit of $ " + depositAmount + " made. new balance is $ " + this.balance);
    }

//    creating a with draw function for the user
    public void withdrawFunds(double withdrawAmount){
//        if the with draw balance is less than your account balance then you have insufficient funds
        if (balance - withdrawAmount < 0){
            System.out.println("in sufficient funds ! you have only $ " + balance + "in your account");
        } else {
            balance -= withdrawAmount;
            System.out.println("withdraw of $ " + withdrawAmount + " processed , remaining balance $ " + balance);
        }
    }

//    now we are creating both getters and setters


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
