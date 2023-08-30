class Elephant {
    int age;
    private double weight;

    Elephant(){
        age =0;
        weight =0;
    }

    Elephant(int a, int w){
        age =a;
        weight =w;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public void loseWeight(){
        weight = weight - (age/4.0);
    }

    public String toString(){
        return "age is "+ age +" and weight "+ weight;
    }

    public static void main(String[] args) {
        //create elephant Bob and Dumbo
        Elephant Bob = new Elephant(1,10);
        Elephant Dumbo = new Elephant(8,400);

        //print each elephant's age and weight
        System.out.println("Elephant Bob's "+ Bob.toString());
        System.out.println("Elephant Dumbo's "+ Dumbo.toString());

        //make Dumbo lose weight
        Dumbo.loseWeight();

        //display Dumbo's age and new weight
        System.out.println("After lose weight, Dumbo's "+ Dumbo.toString());
    }
}
