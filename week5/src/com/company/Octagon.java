/*
Stephen Pillsbury
Assignment 2
CSC 360

Represents the octagon to be tested in TestOctagon.java.
Has attributes representing the side length of the octagon and
whether it was cloned, and methods to calculate the perimeter
and area of the octagon.
*/
package com.company;
import java.lang.Math;


public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
    private double side;
    private boolean wasCloned;

    Octagon(int length){

        this.side = length;

    }

    public double getArea(){

        return (2 + 4 / Math.sqrt(2)) * this.side * this.side;

    }

    public double getPerimeter(){

        return this.side * 8;

    }

    @Override
    public int compareTo(Octagon oct){

        return Double.compare(this.side, oct.side);

    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {

        Octagon cloneAgon = (Octagon) super.clone();
        cloneAgon.wasCloned = true;
        return cloneAgon;

    }

    @Override
    public String toString(){

      return( "Octagon with side = " + this.side +
       ", perimeter = " + this.getPerimeter() + " , area = " + this.getArea() +
       ", wasCloned = " + this.wasCloned );

    }

}
