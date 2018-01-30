import java.util.Scanner;

public class ReadSite {
  public static void main(String[] args) {
    String URLString = args[0];
       
    try {
      java.net.URL url = new java.net.URL(URLString); 
      int count = 0;
      Scanner input = new Scanner(url.openStream());
      while (input.hasNext()) {
        String line = input.nextLine();
	System.out.println(line);
        count += line.length();
      } 
      
      System.out.println("The file size is " + count + " characters");
    }
    catch (java.net.MalformedURLException ex) {
      System.out.println("Invalid URL");
    }
    catch (java.io.IOException ex) {
      System.out.println("IO Errors");
    }
  }
}   
