/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 6C
*/

import java.util.*;
public class Assignment6C {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        String userInput = null;



        //input value
        System.out.print("Enter a string: ");
        userInput = input.nextLine();

        //use method to translate each characters
        for (int i=0; i< userInput.length();i++){
            System.out.print(translate(userInput.charAt(i)));
        }


        //reclaim resource
        input.close();
    }


    //method translate individual character
    public static String translate(char c) {
        //declare value
        String output = String.valueOf(c);
        char[] a1 = new char[26];
        String[] a2 = {"4", "B", "(", "D", "3", "Ph", "9", "|-|", "1", "j", "|<", "L", "/\\\\/\\\\", "|\\\\|", "0", "P", "Q", "R", "$", "7", "U", "\\\\/", "\\\\/\\\\/", "><", "‘/", "Z"};


        //assign values for a1
        for (int i = 0; i < 26; i++) a1[i] = (char) (i + 97);

        //get new Char
        for (int i = 0; i < 26; i++) {
            if (c == a1[i]) {
                output = a2[i];
                break;
            }
        }

        return output;
    }
}
