package com.company;
import java.lang.Math;


public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
   public double side;
   public boolean wasCloned;

    public Octagon(int length){

        this.side = length;

    }

    public double getArea(){

        //area = (2 + 4 / Math.sqrt(2)) * side * side
        return (2 + 4 / Math.sqrt(2)) * this.side * this.side;

    }

    public double getPerimeter(){

        return this.side * 8;

    }

    @Override
    public int compareTo(Octagon oct){

        if(this.side > oct.side) return 1;
        else if (oct.side > this.side) return -1;
        else return 0;

    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {

        Octagon cloneAgon = (Octagon) super.clone();
        cloneAgon.wasCloned = true;
        return cloneAgon;

    }

    @Override
    public String toString(){

       String tempString = "Octagon with side = " + this.side +
       ", perimeter = " + this.getPerimeter() + " , area = " + this.getArea() +
       ", wasCloned = " + this.wasCloned ;

       return tempString;
    }

}
