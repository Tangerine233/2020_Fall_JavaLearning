/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 14A
*/

import java.util.*;
public class Lab14A {
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

        //call methods
        columnTotal(arr);
        rowTotal(arr);

        //reclaim resource
        sc.close();
    }



    //method for summing the rows
    public static void rowTotal(int[][] arr){
        //declare value
        int rowTotal=0;

        //loop to display sum of rows
        for (int x=0; x< arr.length; x++){
            for (int y=0; y< arr[0].length;y++){
                rowTotal = rowTotal + arr[x][y];
            }
            System.out.println("Sum of row "+ x +" is "+ rowTotal);
            rowTotal = 0;
        }
    }

    //method for summing the column
    public static void columnTotal(int[][] arr){
        //declare value
        int columnTotal=0;

        //loop to display sum of columns
        for (int x=0; x< arr[0].length; x++){
            for (int y=0; y< arr.length;y++){
                columnTotal = columnTotal + arr[y][x];
            }
            System.out.println("Sum of column "+ x +" is "+ columnTotal);
            columnTotal = 0;
        }
    }

}
