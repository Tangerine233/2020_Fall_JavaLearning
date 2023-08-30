/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 5C
*/

import java.util.*;
public class Lab5C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int x =0;
        int y =0;

        //input values
        System.out.print("Enter x: ");
        x = input.nextInt();
        System.out.print("Enter y: ");
        y = input.nextInt();

        //display results
        if (x==0&&y==0) System.out.print("This point is the origin.");
        else if (x==0) System.out.print("This point is on the y axis.");
        else if (y==0) System.out.print("This point is on the x axis.");
        else if (x>0&&y>0) System.out.print("This point is in the first quadrant.");
        else if (x<0&&y>0) System.out.print("This point is in the second quadrant.");
        else if (x<0&&y<0) System.out.print("This point is in the third quadrant.");
        else if (x>0&&y<0) System.out.print("This point is in the fourth quadrant.");

        //reclaim resource
        input.close();
    }
}
