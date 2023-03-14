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
    private int duration;
    private double rating;
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

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
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

        System.out.println("Enter title:");
        setTitle(input.nextLine());

        System.out.println("Enter genre:");
        setGenre(input.nextLine());

        System.out.println("Enter release date:");
        setReleaseYear(input.nextLine());

        System.out.println("Enter duration:");
        setDuration(input.nextInt());

        System.out.println("Enter rating");
        setRating(input.nextDouble());

        System.out.println("Enter cast members (when finished, press 'o'):");
        casts();

    }

}
