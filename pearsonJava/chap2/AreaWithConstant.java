import java.util.Scanner; //Scanner is in the java.util package

public class AreaWithConstant {
	public static void main(String[] args) {
		final double PI = 3.14159; // declare pi a constant

		//create a scanner object
		Scanner input = new Scanner(System.in);

		//prompt the user for a radius
		System.out.print("Enter a number to use as the circle's radius:");
		double radius = input.nextDouble(); //remember, all method calls require a pair of parentheses

		//compute area
		double area = radius * radius * PI;

		//display result
		System.out.println("The area for the circle of radius " + 
				radius + " is " + area);
	}
}
