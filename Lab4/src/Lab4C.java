/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 4C
*/

import java.util.*;
public class Lab4C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int userNumber =0;

        //input values
        System.out.print("Select from the following:\n" +
                "To see a list of movies, press 1.\n" +
                "To see show times, press 2.\n" +
                "To pay your bill, press 3.\n" +
                "Choice: ");
        userNumber = input.nextInt();

        //display results
        switch (userNumber){
            case 1:
                System.out.print("The Neverending Story 6\n" +
                        "Princess Diaries: the untold story\n" +
                        "Monty Python and the Programmer");break;
            case 2:
                System.out.print("All movies play at 3PM.");break;
            case 3:
                System.out.print("Corporate accounts payable, Nina speaking.\n" +
                        "Just a moment!");break;
            default:
                System.out.print("I'm sorry, Dave. I can't do that.");
        }

        //reclaim resource
        input.close();
    }
}
