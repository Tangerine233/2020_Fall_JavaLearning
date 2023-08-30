/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 9A
*/

import java.util.*;
public class Lab9A {

    //method find the max value between 3 integers
    public static int max(int x, int y, int z){
        //create value
        int max =0;

        //find maximum number
        if (x>y) max = x;
        else max = y;
        if (z>max) max = z;

        return max;
    }

    //method fin the mini value between 3 integers
    public static int mini(int x, int y, int z){
        //create value
        int mini =0;

        //find minimum number
        if (x<y) mini = x;
        else mini = y;
        if (z<mini) mini = z;

        return mini;
    }

    //method fin the average value between 3 integers
    public static double average(int x, int y, int z){
        //create value
        double average =0;

        //find average number
        average = (x+y+z)/3.0;

        return average;
    }



    //main method
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int num1 =0;
        int num2 =0;
        int num3 =0;

        //input values
        System.out.print("Enter number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        num2 = input.nextInt();
        System.out.print("Enter number 3: ");
        num3 = input.nextInt();

        //display results
        System.out.println("Min is " + mini(num1,num2,num3));
        System.out.println("Max is " + max(num1,num2,num3));
        System.out.print("Average is " + average(num1,num2,num3));

        //reclaim resource
        input.close();
    }
}
