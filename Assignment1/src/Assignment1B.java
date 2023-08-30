/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 1B
*/


//For this assignment, you are going to ask the user for the father’s first name,
// first surname and second surname, and do the same for the mother.
// Then, ask for the first name of the child.
// Finally, you will print out the traditional Spanish name of the child.

import java.util.*;
public class Assignment1B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
            //dad's names
        String dadFirstName =null;
        String dadFirstSurname =null;
        String dadSecondSurname =null;
            //mom's names
        String momFirstName =null;
        String momFirstSurname =null;
        String momSecondSurname =null;
            //kid's names
        String kidFirstName =null;
        String kidFirstSurname =null;
        String kidSecondSurname =null;

        //input values
            //dad
        System.out.print("Enter the father's first name: ");
            dadFirstName = input.nextLine();
        System.out.print("Enter the father's first surname: ");
            dadFirstSurname = input.nextLine();
        System.out.print("Enter the father's second surname: ");
            dadSecondSurname = input.nextLine();
            //mom
        System.out.print("Enter the mother's first name: ");
             = input.nextLine();
        System.out.print("Enter the mother's first surname: ");
            momFirstSurname = input.nextLine();
        System.out.print("Enter the mother's second surname: ");
            momSecondSurname = input.nextLine();
            //kid
        System.out.print("Enter the child's first name: ");
            kidFirstName = input.nextLine();
            kidFirstSurname = dadFirstSurname;
            kidSecondSurname = momFirstSurname;

        //display result
        System.out.println("Parents " + dadFirstName +" and " + momFirstName);
        System.out.print("will have a child named " + kidFirstName +" "+ kidFirstSurname +" "+ kidSecondSurname +".");

        //reclaim resource
        input.close();
    }
}
