/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */


import java.util.Scanner;


public class Password
{
    public static void main (String args[])
    {
        //this is the Known Password is saved:
        String ThePassword  = "abc$123";

        //user enters password now:
        System.out.print("What is the password? ");
        Scanner reader = new Scanner(System.in);
        String password = reader.nextLine();

        /* now if the input is equal to the password that was saved,
           you will be welcomed */
        if(ThePassword.equals (password))
        {
            System.out.println("Welcome!");
        }
        //otherwise, you won't be welcomed!
           else
             {
              System.out.println("I don't know you.");
             }

    }

}