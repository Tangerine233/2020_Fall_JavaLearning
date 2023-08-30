/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 7
*/

import java.util.*;
public class Assignment8A {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int userInput =0;
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        //prompt user to input arr1
        for (int x=0; x< arr1.length; x++){
            for (int y=0; y< arr1[0].length;y++){
                System.out.print("Array 1 slot ("+ x +","+ y +"):");
                arr1[x][y] = sc.nextInt();
            }
        }
        //print out arr1
        for (int x=0; x< arr1.length; x++){
            for (int y=0; y< arr1[0].length;y++){
                System.out.print(arr1[x][y]+"\t");
            }
            System.out.println("");
        }

        //prompt user to input arr2
        for (int x=0; x< arr2.length; x++){
            for (int y=0; y< arr2[0].length;y++){
                System.out.print("Array 2 slot ("+ x +","+ y +"):");
                arr2[x][y] = sc.nextInt();
            }
        }
        //print out arr2
        for (int x=0; x< arr2.length; x++) {
            for (int y = 0; y < arr2[0].length; y++) {
                System.out.print(arr2[x][y] + "\t");
            }
            System.out.println("");
        }


        //call method to check equivalent of 2 arrays
        checkEquivalent(arr1,arr2);


        //reclaim resource
        sc.close();
    }




    //method to print out a sorted array
    public static int[][] sortedArray(int[][] arr){
        int[][] sortedArr = arr;
        int xOfMini = 0;
        int yOfMini = 0;
        int temp=0;

        //loop for exchange sort begin with the mini value
        for (int r =0; r< arr.length; r++) { //loop over each row to get the exchange base
            for (int c =0; c< arr[0].length; c++) { // loop over each column to get the exchange base
                //set the first values in the searching list the mini value as the exchange base
                xOfMini =r;
                yOfMini =c;

                //loop to find the mini value to exchange the current mini
                for (int x = r; x < arr.length; x++) { // loop the target row start with the outer row loop
                    //start loop next to the current exchange base location
                    int y=0;
                    if (x == r) y = c+1; //if it is the current outer row loop that start with the column next to the outer column loop
                    else y = 0; //otherwise start wih the first column
                    for (; y < arr[0].length; y++) {
                        if (arr[xOfMini][yOfMini] > arr[x][y]) {
                            xOfMini = x;
                            yOfMini = y;
                        } //if the value is greater than the current mini, than make the value location to be the mini location
                    }
                }

                //exchange the exchange base with the new mini found by the inner loop
                temp = arr[r][c];
                arr[r][c] = arr [xOfMini][yOfMini];
                arr [xOfMini][yOfMini] = temp;

            }// start a new exchange base after each inner loop
        }

        //print the sortedArray
        for (int x=0; x< sortedArr.length; x++) {
            for (int y = 0; y < sortedArr[0].length; y++) {
                System.out.print("|" + sortedArr[x][y]);
            }
        }
        System.out.print("|\n");

        return sortedArr;
    }



    //method to check equivalent of 2 arrays
    public static void checkEquivalent(int[][] arr1, int[][] arr2){
        //declare value
        boolean isEqual=false;
        //create 2 new arrays by calling method to sort the 2 original array
        int[][] newArr1 = sortedArray(arr1);
        int[][] newArr2 = sortedArray(arr2);

        //loop to check equivalent
        for (int x=0; x< newArr1.length; x++) {
            for (int y = 0; y < newArr1[0].length; y++) {
                if (newArr1[x][y] == newArr2[x][y]) isEqual = true;
                else {
                    isEqual = false;
                    break;
                }
            }
            if (!isEqual) break;
        }

        //print out result
        if (isEqual) System.out.print("Arrays are equivalent.");
        else System.out.print("Arrays are not equivalent.");
    }
}