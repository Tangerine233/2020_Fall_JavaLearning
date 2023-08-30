/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 10B
*/

import java.util.*;
public class Lab10B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        String myString =null;
        String badWord ="dang";
        String replaceWord = "&^#@";

        //input values
        System.out.print("Enter a string: ");
        myString = input.nextLine();

        //loop to display badWord location
        for (int i =0; i<(myString.length() - badWord.length()); i++){
            if(myString.substring(i,(i+badWord.length())).equals(badWord)){
                System.out.println("Found bad word at: "+i);
            }
        }

        //display myString with badWord replaced by replaceWord
        System.out.print(myString.replaceAll(badWord,replaceWord));

        //reclaim resource
        input.close();
    }
}
