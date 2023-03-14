package org.example;
/*
 * The user should contain username password.
 * The user should contain an ArrayList of favorite shows and watch history.
 * FUNCTION: the user should have a function to watch a show and add it to watch history.
 *  *** NOTE: All search functions in user are for searching in favorite shows ***
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Users {

    ArrayList<User> theUsers = new ArrayList();
    Scanner input = new Scanner(System.in);

    public void createAccount(User u){

        for (User i : theUsers) {

            if (u.getPassWord().equals(i)){

                System.out.println("user of password " + u.getPassWord() + " is Already Registered.");

            }

        }

        theUsers.add(u);

    }


    public int login(){

        System.out.println("Enter password:");

        User u = new User();

        u.setPassWord(input.nextLine());

        for (User i : theUsers){

            if (u.getPassWord().equals(i)){

                return 2;

            }

        }


        System.out.println("user is not Registered.");

        System.out.println("Get Registered First.");

        return -1;

    }

    public void addToFavorites(TVShow show) {

        System.out.println("enter your favorite tvshow ftom tvshowlist ");

        System.out.println("title - genre - release date - duration - rating - cast");



    }
    public void viewFavorites() {
        // Implement view favorites logic here
    }





}
