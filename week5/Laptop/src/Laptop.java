/*
Stephen Pillsbury
Assignment 2
CSC 360

Laptop.java creates a list of randomly generated laptops, which have ratings
for their cpu, ram, hdd, screen, price, and battery life specs. Each laptop
is also assigned a score based on these ratings, with higher ratings giving
a higher score.

This list is then converted to an array for sorting purposes, printed, sorted,
then printed again in order from lowest to highest score.
 */


import java.util.*;

public class Laptop implements Comparable<Laptop> {
    private double cpu, screenSize, weight, batteryLife;
    private int ram, hdd, price;
    private boolean graphicsCard;
    private double laptopScore;
    private static final double cpuMax = 3.0;
    private static final double ramMax = 32;
    private static final double hddMax = 2048;
    private static final double screenSizeMax = 17.0;
    private static final double weightMax = 6;
    private static final double batteryLifeMax = 9;
    private static final double priceMax = 2000;

    private Laptop(double cpuSpec, double screenSizeSpec, double weightSpec,
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
        int graphicsRating = (graphicsCard) ? 1 : 0;

        laptopScore = (2 * cpu/cpuMax) + (2 * ram / ramMax) + (hdd / hddMax) + graphicsRating
        + (screenSize / screenSizeMax) + (weight / weightMax) + (batteryLife / batteryLifeMax)
        + (price/priceMax);

    }


    public static void main(String[] args){

       List<Laptop> topList = Laptop.randomLaptopCreator(5);
       Laptop[] topArray = new Laptop[topList.size()];
       topArray = topList.toArray(topArray);

       System.out.println("Printing initial laptop list:");

       for(Laptop randomTop : topArray){
            System.out.println(randomTop.toString());
        }

       Arrays.sort(topArray);

       System.out.println("Printing sorted laptop list:");

       for(Laptop randomTop : topArray){
            System.out.println(randomTop.toString());
        }

    }

private static List<Laptop> randomLaptopCreator(int numTops){

    double cpuSpec, screenSizeSpec, weightSpec, batteryLifeSpec;
    int ramSpec, hddSpec, priceSpec;
    boolean graphicsCardSpec;

    List<Laptop> topList = new ArrayList<Laptop>();

    while(numTops > 0){
        cpuSpec = (Math.random() * 2) + 1;         //for readability, the constants being added should
        screenSizeSpec = (Math.random() * 5) + 12; //probably have been final variables, huh?
        weightSpec = (Math.random() * 4) + 2;      //In any case, they represent the minimum "sane"
        batteryLifeSpec = (Math.random() * 6) + 3; //value for each of the laptop attributes.
        ramSpec = (int)(Math.random() * 28) + 4;
        hddSpec = (int)(Math.random() * 1920) + 128;
        priceSpec = (int)(Math.random() * 1500) + 500;
        double gCard = Math.random() * 2;
        graphicsCardSpec = (gCard > 1);

        Laptop randomTop = new Laptop( cpuSpec, screenSizeSpec, weightSpec,
        batteryLifeSpec, ramSpec, hddSpec, priceSpec,
        graphicsCardSpec);

        topList.add(randomTop);

        numTops--;

    }
   return topList;

}

@Override
    public String toString(){

        return("Laptop Score: " + laptopScore + " CPU: " + cpu + " RAM: " + ram +
                " Hard Drive Capacity: " + hdd + " Has Graphics Card: " + graphicsCard + " Screen Size: " +
                screenSize + " Weight(pounds): " + weight +
                " Battery Life(hours): " + batteryLife + " Price: " + price);

}


@Override
    public int compareTo(Laptop otherTop ){

        return Double.compare(this.laptopScore, otherTop.laptopScore);

    }

}
