package com.Polymorphisam;

public class mainClass {
    public static void main(String[] args) {
        Movie movie = new Adventure("star wars");
        movie.watchMovie();
        Movie movies = new Comedy("no example");
        movies.watchMovie();
        Movie example = new ScienceFiction("interstellar");
        example.watchMovie();
    }
}
