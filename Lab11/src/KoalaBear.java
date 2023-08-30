public class KoalaBear {
    float weight=0;

    KoalaBear(){}

    KoalaBear(float w){
        weight=w;
    }

    void eat(float leaf){
        weight=weight+leaf/1000;
    }

    float getWeight(){
        return weight;
    }
}
