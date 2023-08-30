/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 12A
*/

public class Lab12A {
    public static void main(String[] args) {
        //create two LightBulb l1 and l2
        LightBulb l1 = new LightBulb();
        LightBulb l2 = new LightBulb(1,100);

        //call method to print on both LightBulb
        l1.printStatus();
        l2.printStatus();

        //turn l2 on
        l2.lightSwitch();

        //increase five hours in both LightBulb
        l1.incrementTime(5);
        l2.incrementTime(5);


        //call method to print on both LightBulb
        l1.printStatus();
        l2.printStatus();

    }
}
