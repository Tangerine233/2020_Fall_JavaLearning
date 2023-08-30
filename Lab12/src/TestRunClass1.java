class TestRunClass1 {
    private int i1;
    public int i2;

    TestRunClass1(){
        this(1,2);
    }

    TestRunClass1(int i1, int i2){
        this.i1=i1;
        this.i2=i2;
    }


    public int getI1() {
        return i1;
    }

    public int getI2(){
        return i2;
    }
}
