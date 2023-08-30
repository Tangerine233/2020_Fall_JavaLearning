public class CreditCard {
    private double balance =0;
    private double points =0;

    //default constructor
    CreditCard(){
        balance = 0;
        points = 0;
    }

    //method to print menu
    public void menu(){
        System.out.println("Would you like to:");
        System.out.println("1) Charge");
        System.out.println("2) Make a payment");
        System.out.println("3) See current balance");
        System.out.println("4) Quit");
    }

    //method to charge and add points
    public void charge(double i){
        balance = balance + i;
        points = points + (i/100.00);
    }

    //method to make payment
    public void payment(double i){
        balance = balance - i;
    }

    //method to print balance
    public void printBalance(){
        System.out.println("Balance: " + balance);
        System.out.println("Points: " + points);
    }
}
