/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 4A
*/

import java.util.*;
public class Assignment4A {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int seed1 =0;
        int seed2 =0;
        int iteration =0;
        int temp1 =0;
        int temp2 =0;
        int temp3 =0;

        //input values
        System.out.println("Enter seed 1: ");
        seed1 = sc.nextInt();
        System.out.println("Enter seed 2: ");
        seed2 = sc.nextInt();
        System.out.println("Number of iterations: ");
        iteration = sc.nextInt();

        temp1 = seed1;
        temp2 = seed2;


        //display results
        System.out.print(seed1+","+seed2);

        for (int i=0;i<iteration;i++){
            System.out.print(","+ (temp1+temp2));
            temp3 = temp1;
            temp1 = temp2;
            temp2 = temp3+temp1;
        }

        //reclaim recource
        sc.close();
    }
}
