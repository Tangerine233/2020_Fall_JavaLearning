/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 3B
*/

import java.util.*;
public class Assignment3C {
    //MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //CREATE people,bill,addTip,tip,totalBill
        int people =0;
        float bill =0;
        char addTip =0;
        float tip =0;
        float totalBill =0;

        //PRINT "How many people in your party? "
        System.out.print("How many people in your party? ");
        //READ people
        people = input.nextInt();

        //PRINT "What is the total cost of your bill? "
        System.out.print("What is the total cost of your bill? ");
        //READ bill
        bill = input.nextFloat();


        //IF (people>=6) THEN
        if (people>=6) {
            //bill = bill*1.18
            bill = (float) (bill * 1.18);
        }//END IF


        //PRINT "Your bill is: $" + bill
        System.out.print("Your bill is $" + bill);


        //IF (people>=6) THEN
        if (people>=6) {
            //PRINT "Would you like to include an additional tip (Y/N)? "
            System.out.print("Would you like to include an additional tip (Y/N)? ");
            //READ addTip
            addTip = input.next().charAt(0);

            //IF (addTip=='Y') THEN
            if (addTip=='Y') {
                //PRINT "How much? "
                System.out.print("How much? ");
                //READ tip
                tip = input.nextFloat();
            }
            else {//ELSE
                //tip = 0
                tip = 0;
            }//END IF
        }
        else {//ELSE
            //PRINT "How much for the tip? "
            System.out.print("How much for the tip? ");
            //READ tip
            tip = input.nextFloat();
        }//END IF


        //totalBill = bill + tip
        totalBill = bill + tip;

        //PRINT "Total bill is: $" + totalBill
        System.out.println("Total bill is: $" + totalBill);

        input.close();
    } //END MAIN
}
