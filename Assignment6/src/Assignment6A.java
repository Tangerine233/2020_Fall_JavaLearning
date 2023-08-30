/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 6A
*/

import java.util.*;
public class Assignment6A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int red, green, blue;

        //input values
        System.out.print("Enter a red value (0-255): ");
        red = input.nextInt();
        System.out.print("Enter a green value (0-255): ");
        green = input.nextInt();
        System.out.print("Enter a blue value (0-255): ");
        blue = input.nextInt();

        newColor(red, green, blue);

        //reclaim resource
        input.close();
    }

    //method change ""0 to 255" to "0.0 to 1.0"
    public static void newColor(int r, int g, int b){
        //declare values
        float newR, newG, newB;

        //transform input values
        newR = r/(float)255;
        newG = g/(float)255;
        newB = b/(float)255;

        //display results
        System.out.print("New color is red="+newR+", green="+newG+", blue="+newB);
    }

}
