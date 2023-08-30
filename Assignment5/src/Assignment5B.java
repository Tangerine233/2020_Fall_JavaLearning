/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 5B
*/

import java.util.*;
public class Assignment5B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int numberOfYears =0;
        int startYear =0;
        int tempYear =0;
        int tempStat =0;

        //input values
        System.out.print("Enter the number of years: ");
        numberOfYears = input.nextInt();
        System.out.print("Enter the starting year: ");
        startYear = input.nextInt();

        //declare 'stat[]' and 'years[]'
        int[] stat = new int[numberOfYears];
        int[] year = new int[numberOfYears];

        //give 'year[]' values with starting value of 'startYear'
        for (int i=0; i<numberOfYears; i++) year[i] = startYear+i;

        //input values for 'stat[]'
        for (int i=0; i<numberOfYears; i++){
            System.out.print("Enter stat for year "+year[i]+": ");
            stat[i] = input.nextInt();
        }

        //exchange sort both 'stat[]' and 'years[]' base on 'stat[]'
        for (int i=0; i<numberOfYears-1; i++){
            for (int j=i+1; j<numberOfYears; j++){
                if (stat[j]<stat[i]){
                    tempStat = stat[j];
                    tempYear = year[j];
                    stat[j] = stat[i];
                    stat[i] = tempStat;
                    year[j] = year[i];
                    year[i] = tempYear;
                }
            }
        }

        //display results
        for (int i=0; i<numberOfYears; i++){
            System.out.print(year[i]+"|");
        }

        //reclaim resource
        input.close();
    }
}
