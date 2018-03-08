import java.util.Scanner;

public class ComputeFactorialTailRecursion {
  /** Return the factorial for a specified number */
  public static long factorial(int n) {
    return factorial(n, 1); // Call auxiliary method
  }
    
  /** Auxiliary tail-recursive method for factorial */
  private static long factorial(int n, int result) {
    if (n == 0) 
      return result;
    else
      return factorial(n - 1, n * result); // Recursive call
  }
  
  // Algorithmic translation of the tail-recursive factorial
  // computation directly into loop form.
  public static int factorialWithLoop(int n) {
	  int result = 1;
	  while (true) {
		  if (n == 0)
			  return result;
		  result = n * result;
		  n = n - 1;
	  }
  }
  
  // More concise/cleaner version of factorialWithLoop
  public static int factorialWithLoop1(int n) {
	  int result = 1;
	  for ( ; n >= 1; n--)
		  result *= n;
	  return result;
  }
  
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a non-negative integer: ");
    int n = input.nextInt();
    
    // Display factorial
    System.out.println("Factorial of " + n + " is " + factorial(n));
  }
}
