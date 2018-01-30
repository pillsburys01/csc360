import java.util.*;

public class FileParse {
	public static void main(String[] args) {
		int input, numParse, numUnparse, numValues;
		double average;

		Scanner nameInput = new Scanner(System.in);
		System.out.print("Enter name of input file: ");
		String fileName = nameInput.next();
		nameInput.close();
		try{
			java.io.File file = new java.io.File(fileName);
			Scanner fileReader = new Scanner(file);

		do {

			try{

				int currentNum = fileReader.nextInt();
				System.out.println(currentNum);

			}


			catch(NumberFormatException numEx){
				
				System.out.println(numEx.toString());


			}

			catch(Exception ex){
					
				System.out.println(ex.toString());
			System.exit(1);	

			}




		}


		while(true);

		}



		catch(Exception ex){

			System.out.println("Could not find file: " + fileName);
			System.exit(1);
	}
	}
}
