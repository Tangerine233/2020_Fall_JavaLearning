/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Assignment#: 1C
*/

//For this assignment, you will ask the user for the name of the device,
// the number of calories it burns per pound per hour, the weight of the user,
// the total amount of weight the user wants to lose.
// It will then calculate the number of hours the user needs to spend working out.

import java.util.*;
public class Assignment1C {
    public static void main(String[] args) {
        //set up Scanner
        Scanner input = new Scanner(System.in);

        //declare values
        String deviceName =null;
        double calPerHr =0;
        double weight =0;
        double weightToLose =0;

        double calBurnPerHr =0;
        double hrToLosePerLb =0;
        double hrToLose =0;

        //input values
        System.out.print("Enter the name of the device: ");
            deviceName = input.nextLine();
        System.out.print("Enter its calorie rate per pound per hour: ");
            calPerHr = input.nextDouble();
        System.out.print("Enter your weight: ");
            weight = input.nextDouble();
        System.out.print("Enter the amount of weight to lose: ");
            weightToLose = input.nextDouble();

        //calculate
        calBurnPerHr = calPerHr*weight;
        hrToLosePerLb = 3600/calBurnPerHr;
        hrToLose = hrToLosePerLb*weightToLose;

        //display results
        System.out.println("Burn rate is " +calBurnPerHr+ " calories per hour.");
        System.out.println("It will take ~"+hrToLosePerLb+" hours to lose one pound.");
        System.out.println("It will take ~"+hrToLose+" hours to lose "+weightToLose+" lbs using the "+deviceName+".");

        //reclaim resource
        input.close();
    }
}
