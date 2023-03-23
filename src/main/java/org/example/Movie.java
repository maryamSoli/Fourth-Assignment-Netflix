package org.example;
/*
 *Movie is extended from TVShow and has extra attribute length.
 */

import java.util.Scanner;

class Movie extends TVShow {

    private String length;

    Scanner input = new Scanner(System.in);

    public void setLength(String length) {this.length = length;}

    public String getLength() {return length;}



    public Movie() {

        super();

        System.out.println("Enter Length:");
        setLength(input.nextLine());

    }

}
