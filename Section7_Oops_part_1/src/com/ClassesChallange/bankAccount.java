package com.ClassesChallange;
// constructor is used in the creation of an object that's an instance
// of a class
//it is a special type of code block that has a specific name parameters
//much like a method
//it is same as class but does not return a value
//here the setter are used to update the values of the code
//here the getters are used to just call the settled values from the code
public class bankAccount {
    public static void main(String[] args) {
//        creating an object for account parameter
        Account bankAccount = new Account("12345", 1000.00,
                "tony", "srinadh@gmail.com", "8919405486");

//        for running an empty constructor
        Account bankAcoount = new Account();

//        calling the setter methods from the account class
//        bankAccount.setNumber("457602010017607");
//        bankAccount.setBalance(1000.00);
//        bankAccount.setCustomerName("v");
//        bankAccount.setCustomerEmail("srinadh@gamil.com");
//        bankAccount.setCustomerPhone("8919405486");
        System.out.println(bankAccount.getNumber());
        System.out.println(bankAccount.getBalance());

        bankAccount.depositFunds(1000);
        bankAccount.withdrawFunds(560);
        bankAccount.withdrawFunds(440);
        bankAccount.depositFunds(200);
        bankAccount.withdrawFunds(34.8);
        bankAccount.withdrawFunds(300);


//        calling the empty constructor with some parameters
        Account timsAccount = new Account("srinadh", "nanis@gmail.com", "891945544");
        System.out.println("account no :" + timsAccount.getNumber() +
                "account balance is $ " + timsAccount.getBalance() +
                "your name is " + timsAccount.getCustomerName() +
                "your email is " + timsAccount.getCustomerEmail() + "" +
                "your mobile number is " + timsAccount.getCustomerPhone());


//      creating another object for running through code
        Account naniAccount = new Account("457602",5678.89,"nani","fnn@.com","90494");
        System.out.println("account number is " + naniAccount.getNumber()
        + "your balance is $ " + naniAccount.getBalance()
        + "customer name is " + naniAccount.getCustomerName()
        + " customer email is " + naniAccount.getCustomerEmail()
        + "customer number is " + naniAccount.getCustomerPhone());
    }
}
