package org.example;

public class Main {
    //don't limit yourself to our template ***


    public static void main(String[] args) {

        Movie t = new Movie();

        t.TVShow();
        for(String actors : t.cast){

            System.out.println(actors);
        }

    }

    public static void runMenu(){
        //TODO:
    }
}
