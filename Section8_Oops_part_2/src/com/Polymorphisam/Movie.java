package com.Polymorphisam;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title  + " " +
                "" + "" +
                "is a " + instanceType +
                " film");
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

//    this is an override method
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "pleasent scene","scary music","something bad happens");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    //    this is an override method
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "pleasent scene","scary music","something bad happens");
    }
}


class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    //    this is an override method
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "pleasent scene","scary music","something bad happens");
    }
}