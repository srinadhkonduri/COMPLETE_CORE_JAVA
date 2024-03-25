package com.InheritanceChallange;

public class Employee extends Worker{
//    what are the private classes created in the method please
//    create to string methods to that class
    private long employeeId;
    private String hireDate;
    public Employee(){

    }

    private static int employeeNo = 1;
//    now we should create a following constructor

    public Employee(String name, String birthDate, String hireDate) {
//        this is a super constructor
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }
//    now we should include to string method if there is a super keyword

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
