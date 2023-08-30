import java.awt.*;
import java.util.*;
public class TestRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;

        System.out.print("Enter values is: ");
        number = input.nextInt();

        if (number%2 == 0) {
            System.out.print("The value is Even");
        } else System.out.print("The value is odd");


        input.close();
    }
}
