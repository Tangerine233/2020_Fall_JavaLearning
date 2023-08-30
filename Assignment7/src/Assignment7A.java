/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 7
*/

import java.util.*;
public class Assignment7A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int x =0;
        int y =0;
        int xV =0;
        int yV =0;
        int moves =0;

        //input values
        System.out.println("x:");
        x = input.nextInt();
        System.out.println("y:");
        y = input.nextInt();
        System.out.println("x velocity:");
        xV = input.nextInt();
        System.out.println("y velocity:");
        yV = input.nextInt();
        System.out.println("Number of moves:");
        moves = input.nextInt();

        //call constructor
        Ball ball1 = new Ball(x,y,xV,yV);

        ball1.print();
        //loop for each move
        for (int i =0; i < moves; i++){
            ball1.move();
            ball1.print();
        }

        //reclaim resource
        input.close();
    }
}
