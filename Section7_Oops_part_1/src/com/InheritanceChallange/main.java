package com.InheritanceChallange;
//create a worker class name birthDate endate
//create int age double collect pay terminate
//create employee class employeed hireDate
//create salaried pay annual salary is retired
//and hourly employee hourly payrate double
//so if you implement salaried employee,then execute retire()
//if you implement hourly pay employee then execute get double pay
//FIRST WE HAVE TO CREATE A MAIN METHOD
public class main {
    public static void main(String[] args) {
        Employee srinadh = new Employee("srinadh","29/03/2003",
                "01/01/2020");
        System.out.println(srinadh);
        System.out.println("age = " + srinadh.getAge());
        System.out.println("pay is = " + srinadh.collectPay());

        salariedEmployee nani = new salariedEmployee("nani","29/03/2003",
                "29",35000.00);
        System.out.println(nani);
        System.out.println(nani.getAge());
        System.out.println("pay is = " +nani.collectPay());
        System.out.println("nani payback is $" + nani.collectPay());

        nani.retired();
        System.out.println("nani's pension check is $" + nani.collectPay());

        hourlyEmployee mary = new hourlyEmployee("mary","23",
                "4",20.00);
        System.out.println(mary);
        System.out.println(mary.collectPay());
        System.out.println(mary.getDoublePay());
    }
}
