/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 5A
*/

import java.util.*;
public class Assignment5A {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int years =0;
        int startYear =0;
        int maxStat =0;
        int miniStat =0;

        //input 'years'
        System.out.print("Enter the number of years: ");
        years = input.nextInt();
        //declare 'arr[]' base on years
        int[] arr = new int[years];

        //input 'starYear'
        System.out.print("Enter the starting year: ");
        startYear = input.nextInt();

        //input values in 'arr[]'
        for (int i =0; i<years; i++){
            System.out.print("Enter stat for year "+(startYear+i)+": ");
            arr[i] = input.nextInt();
        }


        //loop for 'maxStat' and 'miniStat'
        for (int i =0; i<years; i++){
            if (arr[i]>=arr[maxStat]) maxStat = i;
            if (arr[i]<=arr[miniStat]) miniStat = i;
        }

        //display results
        System.out.println("Best stat was "+arr[maxStat]+" in year "+(startYear+maxStat));
        System.out.print("Worst stat was "+arr[miniStat]+" in year "+(startYear+miniStat));

        //reclaim resource
        input.close();
    }
}
