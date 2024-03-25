package com.POJO;

public class main {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
//            here we are creating a student indedx for loping all the students
//            in the student class and looping the roll no
            LPAStudent s = new LPAStudent("21F91A04B" + i,
                   switch (i){
                        case 1 -> "tony";
                        case 2 -> "spider man";
                        case 3 -> "america";
                        case 4 -> "thor";
                        case 5 -> "hulk";
                       default -> "anonymous";
                   }
                    ,"29/03/2003","java Master class");
            System.out.println(s);
        }

        Student student = new Student("392S00","srinadh","29","java");
        LPAStudent student1 = new LPAStudent("392s00","nani","28","python");
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student.getName() + " is taking " + student.getClassList());
//        here the student 1 is a record class that's why it does not have any getters and setters
//        we can call the record classes directly in the main method by declaring it.
        System.out.println(student1.id());
    }
}
