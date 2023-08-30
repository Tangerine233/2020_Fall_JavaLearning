/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 4A
*/

import java.util.*;
public class Lab4A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        String day =null;

        //input values
        System.out.print("Enter the day: ");
        day = input.next();

        //display results
        switch (day){
            case "Monday": case "monday": System.out.print("Sounds like someone has a case of the Mondays!");break;
            case "Wednesday": case "wednesday": System.out.print("It's hump day! El ombligo!");break;
            case "Friday": case "friday": System.out.print("Finally. It's Friday!");break;
            case "Tuesday": case "tuesday": case"Thursday": case"thursday": case "Saturday": case "saturday": case "Sunday": case "sunday":
                    System.out.print("It's another day of the week.");break;
        }

        //reclaim resource
        input.close();
    }
}
