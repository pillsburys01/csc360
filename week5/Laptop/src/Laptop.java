import java.util.*;

public class Laptop implements Comparable<Laptop> {

    double cpu, screenSize, weight, batteryLife;
    int ram, hdd, price;
    boolean graphicsCard;
    double laptopScore;
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
        int graphicsRating = (graphicsCard) ? 1 : 2;

        laptopScore = (2 * cpu/cpuMax) + (2 * ram / ramMax) + (hdd / hddMax) + graphicsRating
        + (screenSize / screenSizeMax) + (weight / weightMax) + (batteryLife / batteryLifeMax)
        + (price/priceMax);

/*
    laptopScore = (2 * cpu/cpuMax) + (2 * ram/ramMax) + (1 * hdd/hddMax) + (graphics) + (1 * screen/screenMax) +
    (1 * weight/weightMax) + (1 * battery/batteryMax) + (1 * price/priceMax)
*/
    }

public void randomLaptopGenerator(int numTops){

    double cpuSpec, screenSizeSpec, weightSpec, batteryLifeSpec;
    int ramSpec, hddSpec, priceSpec;
    boolean graphicsCardSpec;

    List<Laptop> topList = new ArrayList<Laptop>();

    while(numTops > 0){
        cpuSpec = (Math.random() * 2) + 1;
        screenSizeSpec = (Math.random() * 5) + 12;
        weightSpec = (Math.random() * 4) + 2;
        batteryLifeSpec = (Math.random() * 6) + 3;
        ramSpec = (int)(Math.random() * 28) + 4;
        hddSpec = (int)(Math.random() * 1920) + 128;
        priceSpec = (int)(Math.random() * 1500) + 500;
        double gCard = Math.random() * 2;

        if(gCard > 1) graphicsCardSpec = false;
        else graphicsCardSpec = true;

        Laptop randomTop = new Laptop( cpuSpec, screenSizeSpec, weightSpec,
         batteryLifeSpec, ramSpec, hddSpec, priceSpec,
        graphicsCardSpec);

        topList.add(randomTop);

        numTops--;

    }

}

@Override
    public String toString(){


        return "";
}


@Override
    public int compareTo(Laptop otherTop ){

        if (this.laptopScore > otherTop.laptopScore) return 1;
        else if (this.laptopScore < otherTop.laptopScore) return -1;
        else return 0;
    }

}
