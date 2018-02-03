/* Stephen Pillsbury
 * CSC 360
 * 
 * This program prompts the user for two integers, then prints their sum.
 * Should the user provide a non-integer, the loop will continue until they
 * do so, with a helpful message being printed every time.
 *
 */


import java.util.*;

public class Problem1{
	public static void main(String[] args){
		
		Integer num1;
		Integer num2;

		num1 = null;
		num2 = null;

		Scanner scanner = new Scanner(System.in);


		do{
			try{
				
				if(num1 == null){
				
					System.out.print("Enter first integer: ");
					String line = scanner.nextLine();
					num1 = Integer.parseInt(line);

					}	

				else{
				
					System.out.print("Enter second integer: ");
					String line = scanner.nextLine();
					num2 = Integer.parseInt(line);
				
				}
			}

			catch(Exception ex){
			
				System.out.println("Try again. (Incorrect input: an integer is required.)");
			
			}

		}

		while(num1 == null || num2 == null);
		
		scanner.close();

		System.out.println("The sum is " + (num1 + num2) );

	}

}
