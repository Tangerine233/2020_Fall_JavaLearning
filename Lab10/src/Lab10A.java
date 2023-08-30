/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 10A
*/

import java.util.*;
public class Lab10A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        String myString = null;
        int counter =0;

        //input value
        System.out.print("Enter a string: ");
        myString = input.nextLine();

        //loop for each character in the string
        for (int i =0; i< myString.length(); i++){
            //print out string with "*" for vowels and count vowels
            switch (myString.charAt(i)){
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.print("*");
                    counter++;
                    break;
                default:
                    System.out.print(myString.charAt(i));
            }
        }

        //display vowels
        System.out.print("\nThat string has "+ counter +" vowels.");

        //reclaim resource
        input.close();
    }
}
