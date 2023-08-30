/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 4B
*/

import java.util.*;
public class Assignment4B {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int userInput =0;

        //input values
        System.out.println("Size: ");
        userInput = sc.nextInt();


        //display results

        //loop for vertical output
        for (int v = userInput; v>0; v--){
            //space in front of each line
            for (int i = userInput-v; i>0; i--) System.out.print("  ");
            //loop for horizontal out put
            for (int h =0; h<v; h++){
                System.out.print(h+" ");
            }
            //next line when finish last horizontal output
            System.out.print("\n");

        }

        //reclaim resource
        sc.close();
    }
}
