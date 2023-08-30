/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 6B
*/

import java.util.*;
public class Lab6B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int mini=1001;
        int max =-1001;
        int userInput =-1;

        //loop while input not equals to 0
        while (userInput!=0){
            System.out.print("Enter a number between -1000 and +1000: ");
            userInput = input.nextInt();

            //check is valid
            if (userInput<-1000||userInput>1000){
                System.out.println("Invalid input");
            }
            //check with max and mini
            else{
                if (userInput<mini) mini = userInput;
                if (userInput>max) max = userInput;
                System.out.println("Min is "+ mini + "\nMax is "+ max);
            }
        }


        //reclaim resource
        input.close();
    }
}
