/*
* Stephen Pillsbury
* CSC 360 Assignment 5 (04/08/2018)
*
* This program calculates decimal exponents with simple iteration, simple recursion,
* recursion using exponentiation by squaring, tail recursion using exponentiation by squaring,
* and iteration using exponentiation by squaring. It also keeps track of the number of multiplications
* necessary to achieve a result.
*
* */

import java.util.Scanner;

public class PowersPillsburys1 {

    private static int multiplications = 0;

    public static void main(String[] args){

        Scanner lineReader = new Scanner(System.in);

        System.out.println("Enter a decimal number : ");
        double b = lineReader.nextDouble();

        System.out.println("Enter a non-negative integer exponent : ");
        int n = lineReader.nextInt();

        System.out.println("Computing " + b +" to the power " + n + ": ");

        System.out.println("Math.pow(" + b + "," + n + ") = " + Math.pow(b, n));

        System.out.println("power1(" + b + "," + n + ") = " + power1(b, n));
        System.out.println("Multiplications = " + multiplications);
        multiplications = 0;

        System.out.println("power2(" + b + "," + n + ") = " + power2(b, n));
        System.out.println("Multiplications = " + multiplications);
        multiplications = 0;

        System.out.println("power3(" + b + "," + n + ") = " + power3(b, n));
        System.out.println("Multiplications = " + multiplications);
        multiplications = 0;

        System.out.println("power4(" + b + "," + n + ") = " + power4(b, n));
        System.out.println("Multiplications = " + multiplications);
        multiplications = 0;

        System.out.println("power5(" + b + "," + n + ") = " + power5(b, n));
        System.out.println("Multiplications = " + multiplications);
        multiplications = 0;

    }

    private static double power1(double base, int power){
        //our basic iterative solution. loops (exponent) number of times.
        double acc = 1;

        if(power == 0) return acc;

        else{

            for(int i = 0; i < power; i++) {

                acc *= base;
                multiplications++;

            }
            return acc;
        }

    }

    private static double power2(double base, int power){
        //Our basic recursive solution. Generates (exponent) stack frames. :(
        if(power == 0) return 1;

        else if(power > 0){

            multiplications++;
            return base * power2(base, --power);

        }
        else{ //I added this as a response to the hypothetical "what if negative exponent"
              //prompt in the assignment spec. I imagine something similar could be done for the other
              //methods, but, uh... I'm lazy?
            multiplications++;
            return (1/base * power2(base, ++power));

        }


    }

    private static double power3(double base, int power ){
       //Recursive method using exponentiation by squaring. Generates a stack frame for each
       //multiplication, but does waaaaay less of them than in power2.
       if (power == 0) return 1;

       else if((power % 2) == 0 ) { //even power

           double accumulator;
           accumulator = power3(base, power / 2);
           multiplications++;
           return accumulator * accumulator;

       }

       else { //odd power

           double accumulator;
           accumulator = power3(base, power / 2);
           multiplications += 2 ;
           return accumulator * accumulator * base;

       }
    }

    private static double power4(double base, int power){
        //Just a helper method. Initializes our accumulator to 1, which is handy, since it
        //handles powers of zero nicely.

        return multPow(1, base, power);
    }

    private static double multPow(double accumulator, double base, int power){
        //Like power3, but tail recursive. theoretically, only uses one stack pane!
        //(I didn't check :(  )

        if(power == 0 ) return accumulator;

        else if( power == 1 ){

            multiplications++;
            return base * accumulator;

        }

        else if ((power % 2) == 0){

            multiplications ++;
            return multPow(accumulator, base * base, power / 2);

        }

        else {

                multiplications += 2;
                return multPow(accumulator * base, base * base, power / 2);

        }
    }

    private static double power5(double base, int power){
        //like power4, but with a loop instead of tail recursion.
        //...this was WAY easier to wrap my head around.
        double acc = 1;


        for(;power > 0; power = power / 2){

            if (power == 1){

                multiplications++;
                return base * acc;

            }

            else if ((power % 2) == 0){

                multiplications++;
                base = base * base;
            }

            else{

                multiplications += 2;
                acc = acc * base;
                base = base * base;

           }
        }

        return acc;
    }

}


