/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 11C
*/

public class Lab11C {
    public static void main(String[] args) {
        //call default constructor
        KoalaBear k1 = new KoalaBear(100);

        //show weight of k1 after eating each time
        k1.eat(400);
        System.out.println("This koala weighs "+ k1.getWeight() + " kilos");
        k1.eat(300);
        System.out.println("This koala weighs "+ k1.getWeight() + " kilos");
        k1.eat(650);
        System.out.println("This koala weighs "+ k1.getWeight() + " kilos");
    }
}
