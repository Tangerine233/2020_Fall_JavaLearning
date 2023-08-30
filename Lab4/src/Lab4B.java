/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 4B
*/

import java.util.*;
public class Lab4B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int hours =0;
        int earn =0;

        //input values
        System.out.print("Number of hours this week: ");
        hours = input.nextInt();

        //calculate
        if (hours<40){
            earn = hours*15;
        }
        else earn = 15*40 + (hours-40)*25;

        //display results
        System.out.print("Earnings: $" + earn);

        //reclaim resource
        input.close();
    }
}
