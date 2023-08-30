/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 7B
*/

import java.awt.*;
import java.util.Scanner;

public class Lab7C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare value
        int userInput =0;
        boolean identical = true;

        //input value
        System.out.print("Enter the size of the arrays: ");
        userInput = input.nextInt();

        //create arr1[] and arr2[]
        double[] arr1 = new double[userInput];
        double[] arr2 = new double[userInput];

        //input values in arr1[] and arr2[]
        for (int i=0; i<userInput;i++){
            System.out.print("Enter array 1 slot "+ i +": ");
            arr1[i] = input.nextDouble();
            System.out.print("Enter array 2 slot "+ i +": ");
            arr2[i] = input.nextDouble();
        }

        //compare arr1[] and arr2[]
        for (int i=0; i<userInput;i++){
            if (arr1[i]!=arr2[i]) identical = false;
        }


        //display results
        if (identical) System.out.print("The arrays are identical");
        else System.out.print("The arrays are not identical");



        //reclaim resource
        input.close();
    }
}
