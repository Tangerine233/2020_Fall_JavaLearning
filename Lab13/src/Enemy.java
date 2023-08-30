public class Enemy {
    //declare values
    private int hP;
    private int damage;
    private boolean alive = false;

    Enemy(){
        this(1,0);
    }

    Enemy(int hP, int damage){
        this.hP = hP;
        this.damage = damage;
        if (hP>0) alive =true;
        else alive = false;
    }

    public void takeDamage(int i){
        hP = hP - i;
        if (hP<=0){
            alive = false;
        }
    }

    public boolean checkAlive(){
        return alive;
    }

    public int getHP(){
        return hP;
    }
}
