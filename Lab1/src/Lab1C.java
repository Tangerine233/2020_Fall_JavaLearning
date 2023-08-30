/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 1C
*/


// Program Lab1C.java
// Demonstrate the use of the Scanner class to read numeric data.
import java.util.*;
public class Lab1C {

    // Calculates fuel efficiency based on values entered by the user.
    public static void main (String[] args){
        //declare values
        int miles;
        double gallons, mpg;
        //set up scanner
        Scanner scan = new Scanner (System.in);

        //enter miles
        System.out.print ("Enter the number of miles: ");
        miles = scan.nextInt();

        //enter gallons
        System.out.print ("Enter the gallons of fuel used: ");
        gallons = scan.nextDouble();

        //calculate mpg
        mpg = miles / gallons;
        //display mpg
        System.out.println ("Miles Per Gallon: " + mpg);

        //reclaim resource
        scan.close();
    }

}
