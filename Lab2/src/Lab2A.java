/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 2A
*/


//Lab2A: MadLibs. Several years ago, parents would buy their kids a copy of MadLibs before going
//on a long car trip. Basically, one person would ask another to provide a name, an adverb, an
//adjective, a number, and so on. The responses would then get plugged into a pre-written script,
//and the results would be bizarrely funny. For this assignment, we’re going to code a short version
//of that. Your program should behave like the following code. User input is denoted in bold. Both
//the class and filename should be called Lab2A(.java, .cs, .cpp).

import java.util.*;
public class Lab2A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        String name =null;
        String anotherName =null;
        String verb =null;
        String adverb =null;

        //input values
        System.out.print("Enter a name: ");
        name = input.nextLine();
        System.out.print("Enter another name: ");
        anotherName = input.nextLine();
        System.out.print("Enter a verb: ");
        verb = input.nextLine();
        System.out.print("Enter an adverb: ");
        adverb = input.nextLine();

        //display results
        System.out.print("Once upon a time, there was a person named "+ name +" who had a child named " + anotherName +
                ". This child would "+ verb +" "+adverb+" while singing to strangers.");

        //reclaim resource
        input. close();
    }
}
