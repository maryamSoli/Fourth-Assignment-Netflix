package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    private String userName;

    private String passWord;

    Scanner input = new Scanner(System.in);

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {return userName;}

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }




    public User(){

        System.out.println("Enter user name:");
        setUserName(input.nextLine());

        System.out.println("Enter password:");
        setPassWord(input.nextLine());
    }


}


