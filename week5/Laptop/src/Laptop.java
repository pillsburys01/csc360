import java.util.*;

public class Laptop implements Comparable<Laptop> {

    double cpu, screenSize, weight, batteryLife, laptopScore;
    int ram, hdd, price;
    boolean graphicsCard;

    static final double cpuMax = 3.0;
    static final double ramMax = 32;
    static final double hddMax = 2048;
    static final double screenSizeMax = 17.0;
    static final double weightMax = 6;
    static final double batteryLifeMax = 9;
    static final double priceMax = 2000;

    public Laptop(double cpuSpec, double screenSizeSpec, double weightSpec,
                  double batteryLifeSpec, int ramSpec, int hddSpec, int priceSpec,
                  boolean graphicsCardSpec){

        cpu = cpuSpec;
        screenSize = screenSizeSpec;
        weight = weightSpec;
        batteryLife = batteryLifeSpec;
        ram = ramSpec;
        hdd = hddSpec;
        price = priceSpec;
        graphicsCard = graphicsCardSpec;

        laptopScore = 0;






    }







    public int compareTo(Laptop otherTop ){

        return 0;
    }

}
