// Exercise18_03.java: Find the GCD of two integers
import java.util.Scanner;

public class Exercise18_03 {
  public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    
    // Enter the first number
    System.out.print("Enter the first number: ");
    int m = input.nextInt();

    // Enter the second number
    System.out.print("Enter the second number: ");
    int n = input.nextInt();
    input.close();

    System.out.println("The GCD of " + m + " and " + n + " is " +
      gcd(m, n));
  }

  public static int gcd(int n, int m) {
    if (n % m == 0)
      return m;
    else
      return gcd(m, n % m);
  }
}
