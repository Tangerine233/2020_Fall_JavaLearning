/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 2B
*/


import java.util.*;
public class Assignment2B {
    //MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //CREATE width, length, areaFeetPerDot, area, dots
        double width =0;
        double length =0;
        double areaFeetPerDot =0;
        double area =0;
        double dots =0;

        //		PRINTLINE “Width: ”
        System.out.println("Width: ");
        //		READ width
        width = input.nextDouble();
        //		PRINTLINE “Length: ”
        System.out.println("Length: ");
        //		READ length
        length = input.nextDouble();
        //		PRINTLINE “Square feet per dot: ”
        System.out.println("Square feet per dot: ");
        //		READ areaFeetPerDot
        areaFeetPerDot = input.nextDouble();
        //		area = width * length
        area = width * length;
        //		dots = area / areaFeetPerDot
        dots = area / areaFeetPerDot;
        //		PRINT “An area of ”+ area + “ square feet will take ” + dots + “ dots to cut.”
        System.out.print("An area of "+(int)area+" square feet will take "+dots+" dots to cut.");

        input.close();
    }
    //END MAIN
}
