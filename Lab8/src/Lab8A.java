/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 8A
*/

import java.util.*;
public class Lab8A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int arrSize = 10;
        int[] arr = new int[arrSize];
        int temp =0;
        int counter =0;

        //input values in 'arr[]'
        for (int i =0; i<arrSize; i++){
            System.out.print("Enter slot " + i + ": ");
            arr[i] = input.nextInt();
        }

        //sorting and display
        for (int i =0; i<arrSize; i++){
            //bubble sort
            for (int j =0; j<arrSize-1; j++){
                if (arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    counter++;
                }
            }

            //display sorting process
            for (int j =0; j<arrSize; j++){
                System.out.print(arr[j] + "|");
            }
            //display number of swaps
            System.out.println(" Num swaps: " + counter);
        }

        //reclaim resource
        input.close();
    }
}
