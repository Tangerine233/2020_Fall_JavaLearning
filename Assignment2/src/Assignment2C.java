/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 2C
*/

import java.util.*;
public class Assignment2C {
    //MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //		CREATE horizontalPixels, verticalPixels, diagonalLength, ppi
        double horizontalPixels =0;
        double verticalPixels =0;
        double diagonalLength =0;
        double ppi =0;

        //		PRINTLINE “Horizontal pixels: ”
        System.out.println("Horizontal pixels: ");
        //		READ horizontalPixels
        horizontalPixels = input.nextDouble();

        //		PRINTLINE “Vertical pixels: ”
        System.out.println("Vertical pixels: ");
        //		READ verticalPixels
        verticalPixels = input.nextDouble();

        //		PRINTLINE “Diagonal length in inches: ”
        System.out.println("Diagonal length in inches: ");
        //		READ diagonalLength
        diagonalLength = input.nextDouble();

        //		ppi = Sqrt(horizontalPixels * horizontalPixels + verticalPixels * verticalPixels) / diagonalLength
        ppi = Math.sqrt(Math.pow(horizontalPixels,2) + Math.pow(verticalPixels,2)) / diagonalLength;

        //		PRINT “Pixels per inch: ” + ppi
        System.out.print("Pixels per inch: " + (int)ppi);

        input.close();
    }
    //END MAIN
}
