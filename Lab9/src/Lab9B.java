/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 9B
*/

import java.util.*;
public class Lab9B {
    //set up scanner
    static Scanner input = new Scanner(System.in);
    //main method
    public static void main(String[] args) {


        //declare value
        int userInput =0;
        int arrSize = 10;
        int[] arr = new int[arrSize];

        //initialize array
        initArray(arr);

        //loop while user didn't input quiting value
        while (userInput!=5){

            //print menu and input value
            printMenu();
            //read userInput
            userInput = input.nextInt();

            //switch to each each method
            switch (userInput){
                case 1: enterNum(arr);break;
                case 2: printArray(arr);break;
                case 3: printSum(arr);break;
                case 4: initArray(arr);break;
                case 5:break;
                default: System.out.println("*******Invalid input*******\n");
            }


        }

        //reclaim resource
        input.close();
    }





    // 1st method to edit an array
    public static void enterNum(int[] arr){
        //declare values
        int slot=0;
        int value=0;

        //input values
        System.out.print("Enter the slot: ");
        slot = input.nextInt();
        System.out.print("Enter the new value: ");
        value = input.nextInt();

        //input values to the array
        arr[slot] = value;
    }



    // 2nd method to print an array
    public static void printArray(int[] arr){
        //printing
        for (int i=0; i<arr.length; i++){
            System.out.print("|"+arr[i]);
        }
        //next line
        System.out.println("");
    }



    // 3rd method to fin the sum of an array
    public static void printSum(int[] arr){
        //declare values
        int sum =0;

        //find sum
        for (int i =0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        //print result
        System.out.println(sum);
    }



    // 4th method to initialize array
    public static void initArray(int[] arr){
        //put 0 for each slot in the array
        for (int i=0; i<arr.length; i++) arr[i] = 0;
    }



    // 5th method to print the menu
    public  static void printMenu(){
        System.out.println("Would you like to:");
        System.out.println("1) Enter a number");
        System.out.println("2) Print the array");
        System.out.println("3) Find the sum of the array");
        System.out.println("4) Reset the array");
        System.out.println("5) Quit");
    }
}
