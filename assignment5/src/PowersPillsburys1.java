import java.util.Scanner;

public class PowersPillsburys1 {
    public static void main(String[] args){

        Scanner lineReader = new Scanner(System.in);

        System.out.println("Enter a base for the exponent: ");
        double b = lineReader.nextDouble();

        System.out.println("Enter an exponent to raise the base to: ");
        int n = lineReader.nextInt();

        System.out.println("power1's result of raising " + b + " to the " +
        n + "'th power: " + power1(b, n));

        System.out.println("Math.pow's result of raising " + b + " to the " +
                n + "'th power: " + Math.pow(b, n));

        System.out.println("power2's result of raising " + b + " to the " +
                n + "'th power: " + power2(b, n));

        System.out.println("power3's result of raising " + b + " to the " +
                n + "'th power: " + power3(b, n));

        System.out.println("power4's result of raising " + b + " to the " +
                n + "'th power: " + power4(b, n));

    }

    private static double power1(double base, int power){
       //basic iterative solution for powers >= 0
        double total = base;

        if(power == 0) return 1;

        else if(power < 0) return -1; //Not accurate, but a (perhaps) sane failure

        else{

            for(int i = 1; i < power; i++) {

                total *= base;

            }
            return total;
        }

    }

    private static double power2(double base, int power){

        if(power == 0) return 1;

        else if(power > 0) return base * power2(base, --power);

        else return (1/base * power2(base, ++power)); //if power < 0


    }

    private static double power3(double base, int power ){

       if (power == 0) return 1;

       else if((power % 2) == 0 ) { //even power

           double accumulator;
           accumulator = power3(base, power / 2);
           return accumulator * accumulator;

       }

       else { //odd power

           double accumulator;
           accumulator = power3(base, power / 2);
           return accumulator * accumulator * base;

       }
    }

    public static double power4(double base, int power){

        return multPow(1, base, power);
    }

    public static double multPow(double accumulator, double base, int power){

        if(power == 0 ) return accumulator;

        else if( power == 1 ) return base * accumulator;

        else if ((power % 2) == 0){

            return multPow(accumulator, base * base, power / 2);
        }

        else {
                return multPow(accumulator * base, base * base, power / 2);
        }
    }

}


