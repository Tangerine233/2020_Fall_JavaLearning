import java.util.*;
public class TestRun2 {
    public static void main(String[] args) {
        //set up Scanner
        Scanner input = new Scanner(System.in);


        //declare values
        String passengerName =null;
        int numberOfCruises =0;

        //input values
        System.out.print("Enter name: ");
        passengerName = input.nextLine();
        System.out.print("Enter number of cruises you been before: ");
        numberOfCruises = input.nextInt();

        //display results
        if (numberOfCruises == 0){
            System.out.print("Welcome aboard! Please join us for free drinks on the Lido deck");
        }
        else if (numberOfCruises<5){
            System.out.print("Welcome back! Please join us for dinner and dancing Aft lounge tonight.");
        }
        else System.out.print("Welcome back! We glad to have you aboard.");


        for (int i=0;i<7;i++){

        }


        //reclaim resource
        input.close();
    }
}
