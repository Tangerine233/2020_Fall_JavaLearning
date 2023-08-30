/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 4D
*/

import java.util.*;
public class Lab4D {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        double gallons = 0;
        double bill = 0;

        //input values
        System.out.print("Gallons of water: ");
        gallons = input.nextDouble();

        //calculate
        if (gallons<0){
            System.out.print("invalid input");return;
        }
        else if (gallons<=1000){
            bill = gallons*0.15;
        }
        else if (gallons<=2000){
            bill = (1000*0.15) + (gallons-1000)*0.25;
        }
        else {
            bill = (1000*0.15) + (1000*0.25) + (gallons-2000)*0.35;
        }

        //display results
        System.out.print("Water bill is: $" + (int)(bill*100)/100.0 );

        //reclaim resource
        input.close();
    }
}
