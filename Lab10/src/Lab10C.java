/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 10B
*/

import java.util.*;
public class Lab10C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        String myString =null;
        String convertedString="";

        //input myString
        System.out.print("Enter a string: ");
        myString = input.nextLine();

        //loop to convert myString to convertedString
        for (int i =0; i<myString.length(); i++){
            if (myString.charAt(i)<97||myString.charAt(i)>123) convertedString=convertedString + myString.charAt(i);
            else convertedString= convertedString + (char)(((myString.charAt(i)-97)+13)%26+97);
        }

        //display results
        System.out.print(convertedString);

        //reclaim resource
        input.close();
    }
}
