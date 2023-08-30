
import java.util.*;
public class TestRun {
    public static void main(String[] args) {
        //set up scanner
        Scanner input = new Scanner(System.in);

        //declare value
        int dice = 0;

        //input value
        System.out.print("Enter dice roll: ");
        dice = input.nextInt();

        //display results
        if (dice == 7){
            System.out.print("Congratulations you've been robbed!");
        }
        else if ((dice<12) && (dice>2)){
            System.out.print("That was close!");
        }
        else System.out.print("invalid input");

        //reclaim resource
        input.close();
    }
}
