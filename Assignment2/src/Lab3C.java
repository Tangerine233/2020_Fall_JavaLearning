/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 3C
*/

import java.util.*;
public class Lab3C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //create values
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        int dollars =0;
        int cents =0;
        int totalInCents =0;

        //input values
        System.out.print("Enter the number of quarters: ");
        quarters = input.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = input.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickels = input.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = input.nextInt();

        //display inputs
        System.out.print("\nYou entered "+ quarters +"quarters.\nYou entered "+ dimes +" dimes.\nYou entered "+ nickels +" nickels.\nYou entered "+ pennies +" pennies.\n");

        //caculate dollars and cents
        totalInCents = 25*quarters + 10*dimes + 5*nickels + pennies;
        dollars = totalInCents/100;
        cents = totalInCents%100;

        //display results
        System.out.print("Your total is "+ dollars +" dollars and "+ cents +" cents.");

        //reclaim resource
        input.close();
    }
}