/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 7B
*/

import java.util.*;
public class Assignment7B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare value
        int userInput =0;
        double amount =0;
        //call constructor
        CreditCard card1 = new CreditCard();

        //loop to operate
        while (userInput !=4 ){
            //print menu
            card1.menu();
            //read userInput
            userInput = input.nextInt();
            //switch to operate
            switch (userInput){
                case 1:
                    System.out.println("Amount to Charge:");
                    amount = input.nextDouble();
                    card1.charge(amount);
                    break;
                case 2:
                    System.out.println("Amount to pay:");
                    amount = input.nextDouble();
                    card1.payment(amount);
                    break;
                case 3:
                    card1.printBalance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid input");
            }

            //next line
            System.out.println("");
        }


        //reclaim resource
        input.close();
    }
}
