package com.ConstructorChallange;

public class main {
    public static void main(String[] args) {
        Customer customer = new Customer("nani",1000,
                "srinadh@gmail.com");

        System.out.println("the customer name is " + customer.getName());
        System.out.println("the customer credit limit is " + customer.getCreditLimit());
        System.out.println("the customer email  is " + customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println("the customer name is " + secondCustomer.getName());
        System.out.println("the customer credit limit is " + secondCustomer.getCreditLimit());
        System.out.println("the customer email  is " + secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("joe",1000);
        System.out.println("the customer name is " + thirdCustomer.getName());
        System.out.println("the customer credit limit is " + thirdCustomer.getCreditLimit());
        System.out.println("the customer email  is " + thirdCustomer.getEmail());

    }
}
