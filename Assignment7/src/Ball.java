public class Ball {
    private int x =0;
    private int y =0;
    private int xV =0;
    private int yV =0;
    private int xWall = 10;
    private int yWall =10;

    //constructor
    Ball(int x, int y, int xV, int yV){
        this.x = x;
        this.y = y;
        this.xV = xV;
        this.yV = yV;
    }

    //method to move
    public void move(){
        //check if touch wall then change direction
        if(x==0 || x== xWall-1) xV = xV * -1;
        if(y==0 || y== yWall-1) yV = yV * -1;

        //move x and y
        x = x + xV;
        y = y + yV;
    }

    //method print position of x and y
    public void print(){
        System.out.println("X:" + x + " Y:" + y);
    }
}
