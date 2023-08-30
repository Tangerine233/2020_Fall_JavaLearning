/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 5B
*/

import java.util.*;
public class Lab5B {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare values
        int today =0;
        int dayTillMeeting =0;
        int weekday =0;
        String meetingDay = null;

        //input values
        System.out.print("Enter a number that represents today (Sunday==0, Monday==1,...) ");
        today = input.nextInt();

        System.out.print("Enter the number of days until the meeting: ");
        dayTillMeeting = input.nextInt();


        //calculate
        weekday = (today+dayTillMeeting)%7;
        switch (weekday){
            case 0: meetingDay = "Sunday";break;
            case 1: meetingDay = "Monday";break;
            case 2: meetingDay = "Tuesday";break;
            case 3: meetingDay = "Wednesday";break;
            case 4: meetingDay = "Thursday";break;
            case 5: meetingDay = "Friday";break;
            case 6: meetingDay = "Saturday";break;
        }


        //display results
        System.out.print("Meeting day is " + meetingDay);


        //reclaim resource
        input.close();
    }
}
