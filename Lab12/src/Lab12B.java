/*
Class: CSE 1321L
Section: 07
Term: Fall 2020
Instructor: Vishal Bilagi
Name: Kainuo He
Lab#: 12B
*/

public class Lab12B {
    public static void main(String[] args) {
        //create two Stock
        Stock g = new Stock("Google","GOG");
        Stock m = new Stock("Microsoft", "MSF");

        //call methods to input values
        g.setClosingValue((float) 134.67);
        g.setCurrentValue((float) 131.98);

        m.setClosingValue((float)156.52);
        m.setCurrentValue((float)161.22);

        //print both Stock
        g.print();
        m.print();
    }
}
