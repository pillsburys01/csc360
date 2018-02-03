/* Stephen Pillsbury
 * CSC 360
 * Assignment 1, Problem 2
 *
 * Prompts the user for the name of a text file.
 * Upon receiving it, iterates through the file
 * one line at a time, attempting to convert each
 * line to an int. If the conversion is successful,
 * the int is added to a running total, which is used
 * after the loop's completion to calculate and 
 * display the average value of the ints parsed,
 * along with the number of lines successfully and 
 * unsuccessfully parsed.
 *
 */



import java.util.*;

public class Problem2 {
	public static void main(String[] args) {

		int numParse;
		int numUnparse;
		int numTotal;
		float numAverage;
		String fileName;
		numTotal = numParse = numUnparse = 0; //I know java initializes to zero, but c habits die hard...	

		Scanner nameInput = new Scanner(System.in);
		System.out.print("Enter name of input file: ");
		fileName = nameInput.next();
		nameInput.close(); 

		try { //if we fail here, print a message and exit before reaching the loop.
			java.io.File file = new java.io.File(fileName);
			Scanner fileReader = new Scanner(file);


			do {

				try{
					String currentLine = fileReader.nextLine();
					int currentNum = Integer.parseInt(currentLine);
					System.out.println(currentNum);
					numParse++;
					numTotal += currentNum;
	
				}
	
	
				catch(NumberFormatException numEx){ //if we parsed a line not parseable to int (ex: "eight")
					System.out.println(numEx.toString());
					numUnparse++;
	
				}
	
				catch(Exception ex){ //if some other icky thing happened (ex: "OutOfMemoryError")
						
					System.out.println(ex.toString());
					System.exit(1);	
	
				}
	
			}


			while(fileReader.hasNext());

		}



		catch(Exception ex){

			System.out.println("Could not find file: " + fileName);
			System.exit(1);
	}

	numAverage = numTotal / numParse;
	System.out.println("Number of parsable lines: " + numParse);
	System.out.println("Average value: " + numAverage);
	System.out.println("Number of unparsable lines: " + numUnparse);
	 
	}
}
