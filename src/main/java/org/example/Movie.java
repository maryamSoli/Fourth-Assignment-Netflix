package org.example;
/*
 *Movie is extended from TVShow and has extra attribute length.
 */

import java.util.Scanner;

class Movie extends TVShow {

    private int length;

    Scanner input = new Scanner(System.in);

    public void setLength(int length) {

        this.length = length;
    }

    public int getLength() {

        return length;
    }

    public Movie()
    {
        super();

        System.out.println("Enter length");
        setLength(input.nextInt());

    }

}
