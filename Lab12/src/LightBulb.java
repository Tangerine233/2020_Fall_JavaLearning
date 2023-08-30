public class LightBulb {
    private int wattage;
    private int totalWatts =0;
    private int iD;
    private boolean isOn =false;


    LightBulb(){
        wattage =40;
        totalWatts =0;
        iD =0;
        isOn =false;
    }

    LightBulb(int i, int w){
        iD =i;
        wattage =w;
    }

    public boolean lightSwitch(){
        if (isOn) isOn = false;
        else isOn = true;
        return isOn;
    }


    public void printStatus(){
        System.out.print("Bulb "+iD+" is ");
        if (isOn) System.out.print("on");
        else System.out.print("off");
        System.out.print(" and has used "+totalWatts+" watt-hours.\n");
    }

    public void incrementTime(int h){
        if (isOn){
            totalWatts = wattage*h;
        }
    }
}
