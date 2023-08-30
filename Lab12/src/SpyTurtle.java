public class SpyTurtle {
    int x;
    int y;
    int m;

    SpyTurtle(){

    }

    SpyTurtle(int x, int y ){
        this.x = x;
        this.y = y;
        this.m = 10;
    }

    void dropMic(){
        this.m--;
    }
}
