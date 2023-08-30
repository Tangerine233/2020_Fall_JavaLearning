/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 14C
*/

import java.util.*;
public class Lab14C {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int userInput =0;
        int[][] arrA = new int[3][3];
        int[][] arrB = new int[3][3];
        int[][] newArr;

        //prompt user to input arrA
        for (int x=0; x< arrA.length; x++){
            for (int y=0; y< arrA[0].length;y++){
                System.out.print("Enter a value:");
                arrA[x][y] = sc.nextInt();
            }
        }
        //prompt user to input arrB
        for (int x=0; x< arrB.length; x++){
            for (int y=0; y< arrB[0].length;y++){
                System.out.print("Enter a value:");
                arrB[x][y] = sc.nextInt();
            }
        }
        System.out.println("");


        //print out arrA
        System.out.println("Matrix A:");
        for (int x=0; x< arrA.length; x++){
            for (int y=0; y< arrA[0].length;y++){
                System.out.print("\t" + arrA[x][y]);
            }
            System.out.println("");
        }
        System.out.println("");
        //print out arrB
        System.out.println("Matrix B:");
        for (int x=0; x< arrB.length; x++){
            for (int y=0; y< arrB[0].length;y++){
                System.out.print("\t" + arrB[x][y]);
            }
            System.out.println("");
        }
        System.out.println("");

        //call method to add arrA and arrB and print the new array out
        newArr = addArrays(arrA,arrB);
        System.out.println("A + B:");
        for (int x=0; x< newArr.length; x++){
            for (int y=0; y< newArr[0].length;y++){
                System.out.print("\t" + newArr[x][y]);
            }
            System.out.println("");
        }


        //reclaim resource
        sc.close();
    }

    //method to add two arrays together
    public static int[][] addArrays(int[][] arrA, int[][] arrB){
        int[][] newArr = new int[arrA.length][arrA[0].length];

        for (int x =0; x <arrA.length;x++){
            for (int y =0; y < arrA[0].length; y++){
                newArr[x][y] = arrA[x][y] + arrB[x][y];
            }
        }

        return newArr;
    }
}
