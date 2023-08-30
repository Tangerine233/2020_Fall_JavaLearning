/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 7A
*/

import java.util.*;
public class Lab7A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int userInput =0;

        //input values
        System.out.print("Enter the size of the array: ");
        userInput = input.nextInt();

        //create array
        int[] arr = new int[userInput];

        //give values to the arr[]
        for (int i =0; i<userInput; i++){
            arr[i]=i*i;
        }

        //display results
        for (int i =0; i<userInput;i++) {
            System.out.print("|"+arr[i]);
        }

        //reclaim resource
        input.close();
    }
}
