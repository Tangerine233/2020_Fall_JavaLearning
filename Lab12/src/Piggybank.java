class Piggybank {
    private int quarters;
    private int dimes;
    private int nickels;
    private int cents;

    Piggybank(){
        this(0,0,0,0);
    }

    Piggybank(int q, int d, int n, int c){
        quarters =q;
        dimes =d;
        nickels =n;
        cents =c;
    }

    public void returnCoins(){
        System.out.println("Total coins: "+ (quarters+dimes+nickels+cents));
    }

    public static void main(String[] args) {
    Piggybank p1 = new Piggybank();
    Piggybank p2 = new Piggybank(1,2,3,4);
    }
}

