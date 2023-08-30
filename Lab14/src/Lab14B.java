/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 14B
*/

import java.util.*;
public class Lab14B {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int userInput =0;
        int[][] arr = new int[3][4];

        //ask the user to input value in arr
        for (int x=0; x< arr.length; x++){
            for (int y=0; y< arr[0].length;y++){
                System.out.print("Enter a value: ");
                arr[x][y] = sc.nextInt();
            }
        }
        System.out.println("");

        //print out arr[]
        System.out.println("The entered matrix:");
        for (int x=0; x< arr.length; x++){
            for (int y=0; y< arr[0].length;y++){
                System.out.print("\t"+ arr[x][y]);
            }
            System.out.println("");
        }
        System.out.println("");

        //call method
        findMax(arr);

        //reclaim resource
        sc.close();
    }


    //method to return the location of the maximum value in the arr
    public static void findMax(int[][] arr){
        int rowOfMax =0;
        int columnOfMax =0;
        int max = arr[0][0];

        for (int x=0; x< arr.length; x++){
            for (int y=0; y< arr[0].length;y++){
              if (arr[x][y]>max){
                  max = arr[x][y];
                  rowOfMax =x;
                  columnOfMax =y;
              }
            }
        }

        System.out.println("First largest value is located at row "+ rowOfMax + " and column " + columnOfMax);
    }
}
