/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 1A
*/


//write a simple calculator that determines how much an irreputable subscription-based company
// makes per month as well as per year.
import java.util.*;
public class Assignment1A {

    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare value
        int feePerMonth =0;
        int numberOfCustomers =0;

        //input values
        System.out.print("Enter the monthly subscription fee: ");
        feePerMonth = input.nextInt();
        System.out.print("Enter the number of paying customers: ");
        numberOfCustomers = input.nextInt();

        //calculate and display result
        System.out.println("This company makes $" +
                feePerMonth * numberOfCustomers
                + " per month.");
        System.out.println("This company makes $" +
                feePerMonth * numberOfCustomers * 12
                + " per year.");

        //reclaim resource
        input.close();
    }
}
