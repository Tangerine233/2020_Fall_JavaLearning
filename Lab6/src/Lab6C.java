/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 6C
*/

import java.util.*;
public class Lab6C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int startNumber =0;
        int endNumber =0;
        int max =0;
        int mini =0;
        int sumOfOdds =0;
        int temp=0;

        //input values
        System.out.print("Enter a starting number: ");
        startNumber = input.nextInt();
        System.out.print("Enter an ending number: ");
        endNumber = input.nextInt();

        if (startNumber<endNumber){
            mini = startNumber;
            max = endNumber;
        }
        else{
            mini = endNumber;
            max = startNumber;
        }

        //give temp odd value
        temp = mini;
        if (temp%2==0) temp++;

        //loop for sum of odds
        while (temp<=max){
            sumOfOdds = sumOfOdds +temp;
            temp = temp+2;
        }

        //display results
        System.out.print("Sum of odds is: "+ sumOfOdds);

        //reclaim resource
        input.close();
    }
}
