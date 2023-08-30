/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 3B
*/

import java.util.*;
public class Assignment3B {
    //MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //		CREATE firstNumber, secondNumber, operator
        int firstNumber =0;
        int secondNumber =0;
        char operator =0;

        //		PRINT "Enter the first number: "
        System.out.print("Enter the first number: ");
        //		READ firstNumber
        firstNumber = input.nextInt();

        //		PRINT "Enter the second number: "
        System.out.print("Enter the second number: ");
        //		READ secondNumber
        secondNumber = input.nextInt();

        //		PRINT "Enter the operator to apply: "
        System.out.print("Enter the operator to apply: ");
        //		READ operator
        operator = input.next().charAt(0);

        //		SWITCH operator
        switch (operator) {
            //			CASE '*': PRINT firstNumber*secondNumber
            case '*':
                System.out.print(firstNumber*secondNumber);break;//				BREAK
            //			CASE '/': PRINT firstNumber/secondNumber
            case '/':
                System.out.print(firstNumber/secondNumber);break;//				BREAK
            //			CASE '%': PRINT firstNumber%secondNumber
            case '%':
                System.out.print(firstNumber%secondNumber);break;//				BREAK
            case '+':
                System.out.print(firstNumber+secondNumber);break;//				BREAK
            case '-':
                System.out.print(firstNumber-secondNumber);break;//				BREAK
        }//		END SWITCH
    } //END MAIN
}
