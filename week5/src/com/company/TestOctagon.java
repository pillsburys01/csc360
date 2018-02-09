/*
Stephen Pillsbury
Assignment 2
CSC 360

This file contains the main method for testing Octagon.java.
It creates an Octagon, prints the side length, perimeter, and area
of said octagon, and whether or not it was created by a clone() method.
It then clones the initial Octagon, prints the new Octagon's
characteristics, and prints the results of a Double.compareTo() between
the original and clone's side lengths.


 */

package com.company;

public class TestOctagon {


        public static void main(String[] args) throws CloneNotSupportedException {


                Octagon testAgon = new Octagon(5);

                System.out.println("oct1: " + testAgon.toString());

                Octagon cloneAgon = testAgon.clone();

                System.out.println("oct2: " + cloneAgon.toString());

                System.out.println("oct1.compareTo(oct2): " + testAgon.compareTo(cloneAgon));

        }
}