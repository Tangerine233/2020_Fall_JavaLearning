/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 1B
*/


// Program Lab1B.java
// Demonstrate reading a string from the user.
import java.util.*;
public class Lab1B {

    // Reads a character string from the user and prints it.
    public static void main(String[] args){
        //declare value
        String message;
        //set up scanner
        Scanner scan = new Scanner (System.in);

        //enter text
        System.out.print ("Enter a line of text:");
        message = scan.nextLine();

        //display result
        System.out.println ("You entered: \"" + message + "\"");

        //reclaim resource
        scan.close();
    }

}
