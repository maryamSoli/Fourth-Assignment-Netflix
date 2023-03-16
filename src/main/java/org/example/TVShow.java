package org.example;
/*
 *The TVShow should have a title , genre, release year, duration and a rating.
 *The TVShow should have an ArrayList of the cast.
 */

import java.util.ArrayList;

import java.util.Scanner;

public class TVShow {

    private String title;

    private String genre;

    private String releaseYear;

    private String duration;

    private String rating;

    ArrayList<String> cast = new ArrayList();

    Scanner input = new Scanner(System.in);

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }



    public void casts(){

        while (true){

            String tempCast = input.nextLine();

            if (tempCast.equals("o")){

                break;
            }

            else {

                cast.add(tempCast);
            }

        }

    }



    public void TVShow(){

        System.out.println("Enter Title:");
        setTitle(input.nextLine());

        System.out.println("Enter Genre:");
        setGenre(input.nextLine());

        System.out.println("Enter Release Year:");
        setReleaseYear(input.nextLine());

        System.out.println("Enter Duration:");
        setDuration(input.nextLine());

        System.out.println("Enter Rating:");
        setRating(input.nextLine());

        System.out.println("Enter Cast Members (When Finished , Press 'o'):");
        casts();

    }

}
