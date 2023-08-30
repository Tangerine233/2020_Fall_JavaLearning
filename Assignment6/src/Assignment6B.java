/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 6B
*/

import java.util.*;
public class Assignment6B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int month=0;
        int day=0;

        //input values
        System.out.print("Enter a month: ");
        month = input.nextInt();
        System.out.print("Enter a day: ");
        day = input.nextInt();

        //call method
        season(month,day);

        //reclaim resource
        input.close();
    }

    //method get season
    public static void season(int m, int d){
        if((m>=3&&d>=19)&&(m<=6&&d<20)){
            System.out.print("It is Spring!");
        }
        else if (m<=9&&d<22){
            System.out.print("It is Summer!");
        }
        else if (m<=12&&d<21){
            System.out.print("It is Fall!");
        }
        else System.out.print("It is Winter!");
    }
}
