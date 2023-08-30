/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 5A
*/

import java.util.*;
public class Lab5A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        char symptoms =0;
        char contact =0;

        //ask for symptoms
        System.out.print("Experiencing severe symptoms (Y/N)? ");
        symptoms = input.next().charAt(0);


        if (symptoms=='Y'){
            //display results
            System.out.print("Seek emergency care.");
        }
        else if (symptoms=='N'){
            //ask for contact
            System.out.print("Close contact with someone who has COVID (Y/N)? ");
            contact = input.next().charAt(0);

            //display results
            if (contact=='Y'){
                System.out.print("Quarantine and get tested if you feel sick.");
            }
            else if (contact=='N'){
                System.out.print("If you experience other symptoms, isolate and get tested.");
            }
            else System.out.print("Invalid input");
        }
        else System.out.print("Invalid input");

        //reclaim resource
        input.close();
    }
}
