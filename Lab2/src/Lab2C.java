/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 2C
*/

//Lab2C: Design and implement a program that will read in a width and height from the user and
//then calculate and display the area and perimeter of a rectangle. Format the outputs following this
//sample run. User input is in bold. Both the class and filename should be called Lab2C (.java, .cs,
//.cpp).

import java.util.*;
public class Lab2C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int width=0;
        int height=0;
        int area =0;
        int perimeter=0;

        //input values
        System.out.print("Enter a width: ");
        width = input.nextInt();
        System.out.print("Enter a height: ");
        height = input.nextInt();

        //calculate area and perimeter
        area = width*height;
        perimeter = 2*(width+height);


        //display result
        System.out.println("The area is " + area);
        System.out.print("The perimeter is " + perimeter);

        //reclaim resource
        input.close();
    }
}
