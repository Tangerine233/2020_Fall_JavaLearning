/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 4C
*/

import java.util.*;
public class Assignment4C {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int userInput =0;

        //input values
        System.out.println("Width: ");
        userInput = sc.nextInt();


        //display results

        //loop for vertical output
        for (int v = 0; v<userInput; v++){
            //first line and last line
            if (v==0||v==userInput-1){
                for (int h = userInput; h>0; h--) System.out.print("* ");
            }
            //lines in between
            else{
                //first *
                System.out.print("* ");
                //loop for space between
                for (int h =0; h<userInput-2;h++) System.out.print("  ");
                //last *
                System.out.print("* ");
            }

            //next line when finish last horizontal output
            if (v < userInput-1) {
                System.out.print("\n");
            }
        }

        //reclaim resource
        sc.close();
    }
}
