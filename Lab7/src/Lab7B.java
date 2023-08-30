/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 7B
*/

import java.awt.*;
import java.util.*;
public class Lab7B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare value
        int userInput =0;

        //input value
        System.out.print("Enter the number of GPAs: ");
        userInput = input.nextInt();

        //create arr[]
        double[] arr = new double[userInput];

        //input values in arr[]
        for (int i=0; i<userInput;i++){
            System.out.print("GPA #"+i+": ");
            arr[i] = input.nextDouble();
        }

        //display results
        for (int i=0; i<userInput;i++){
            System.out.print("Student #"+i+": ");
            if (arr[i]>=3.9){
                System.out.println("Summa Cum Laude");
            }
            else if (arr[i]>=3.7){
                System.out.println("Magna Cum Laude");
            }
            else if (arr[i]>=3.5){
                System.out.println("Cum Laude");
            }
            else if (arr[i]>=2){
                System.out.println("Graduating");
            }
            else {
                System.out.println("Not graduating");
            }
        }

        //reclaim resource
        input.close();
    }
}
