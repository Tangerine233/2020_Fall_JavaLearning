/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 3A
*/

import java.util.*;
public class Assignment3A {
    //MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //		CREATE guest1, guest2
        String guest1 =null;
        String guest2 =null;

        //		PRINT "Enter guest 1: "
        System.out.print("Enter guest 1: ");
        //		READ guest1
        guest1 = input.next();
        //		PRINT "Enter guest 2: "
        System.out.print("Enter guest 2: ");
        //      READ guest2
        guest2 = input.next();

        //		IF ((guest1=="Taylor"&&guest2=="Fernando")||(guest2=="Taylor"&&guest1=="Fernando")) THEN
        if ((guest1.equals("Taylor") && guest2.equals("Fernando"))||(guest2.equals("Taylor") && guest1.equals("Fernando"))) {
            //			PRINT "Your party is ruined and another bad pop song will be written."
            System.out.print("Your party is ruined and another bad pop song will be written.");
        }
        //		ELSE
        else {
            //			PRINT "Your party was a hit!"
            System.out.print("Your party was a hit!");
        }// 		END IF

        input.close();
    } //	END MAIN
}
