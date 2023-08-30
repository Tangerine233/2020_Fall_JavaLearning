/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 6A
*/

import java.util.*;
public class Lab6A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare value
        String cookie = "cookie";
        String userInput ="";

        //start a loop to ask question
        while (!userInput.equals(cookie)){
            //input value
            System.out.print("Gimme a cookie: ");
            userInput = input.nextLine();
        }


        //reclaim resource
        input.close();
    }
}
