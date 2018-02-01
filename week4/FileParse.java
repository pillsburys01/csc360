import java.util.*;

public class Problem2 {
	public static void main(String[] args) {

		int numParse;
		int numUnparse;
		int numTotal;
		float numAverage;
		String fileName;
		numTotal = numParse = numUnparse = 0;	

		Scanner nameInput = new Scanner(System.in);
		System.out.print("Enter name of input file: ");
		fileName = nameInput.next();
		nameInput.close();

		try{
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


			catch(NumberFormatException numEx){
				System.out.println(numEx.toString());
				numUnparse++;

			}

			catch(Exception ex){
					
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
