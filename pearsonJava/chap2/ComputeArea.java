import java.util.Scanner; 

public class ComputeArea {
	public static void main(String[] args) {
		//create a scanner object
		Scanner input = new Scanner(System.in);

		//prompt the user to enter a radius
		System.out.print("Please enter a number to use as the radius of the circle:");

		double radius = input.nextDouble();

		//compute area
		double area = radius * radius * 3.14149;

		System.out.println("The area for the circle of the radius " +
				radius + " is " + area);
	}

}	
