package com.InheritanceChallange;

public class Worker {
//    the worker classes has three subtitles in it
    private String name;
    private String birthDate;
    protected String endDate;

// we should create at least one constructor which takes name and birth
    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

//    here we are creating another three sub methods inside the
//    worker class getAge

    public int getAge(){
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear-birthYear);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }

//    now let's create to string method in the program

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
