/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 11B
*/

public class Lab11B {
    public static void main(String[] args) {
        //call constructors
        Turtle t1 = new Turtle();
        Turtle t2 = new Turtle(5,"purple");

        //display result
        System.out.println(t1.speed);
        System.out.print(t2.color);
    }
}
