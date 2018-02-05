package com.company;

public class TestOctagon {


        public static void main(String[] args) throws CloneNotSupportedException {


                Octagon testAgon = new Octagon(5);

                System.out.println("oct1: " + testAgon.toString());

                Octagon cloneAgon = (Octagon) testAgon.clone();

                System.out.println("oct2: " + cloneAgon.toString());

                System.out.println("oct1.compareTo(oct2): " + testAgon.compareTo(cloneAgon));

        }
}