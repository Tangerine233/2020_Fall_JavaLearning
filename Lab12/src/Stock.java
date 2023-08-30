public class Stock {
    private String name="";
    private String symbol="";
    private float closingValue=0;
    private float currentValue=0;

    Stock(){
        closingValue=0;
        currentValue=0;
    }

    Stock(String n, String s){
        this.name = n;
        this.symbol = s;
    }

    public String getName(){
        return this.name;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public void setClosingValue(float v){
        this.closingValue =v;
    }

    public  void setCurrentValue(float v){
        this.currentValue =v;
    }

    public int getChangePercent(){
        return (int)Math.round((currentValue-closingValue)/currentValue*100);
    }


    public void print(){
        System.out.println(
                name + " stock"
                + "\n\tSymbol: " + symbol
                + "\n\tClosing Price: " + closingValue
                + "\n\tCurrent Price: " + currentValue
                + "\n\tChange percent: " + getChangePercent() + "%"
        );
    }

}
