import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;

public class ParenthesisMatch {

    public static void main(String[] args){

        String fileName = "input.txt";
        String line;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null){

                System.out.println("For string " + line +
                ", isParenthesisMatch returned " + isParenthesisMatch(line) + ".");

            }

        }

        catch(FileNotFoundException ex){

            System.out.println("File not found: " + ex.toString());

        }

        catch(Exception ex){

           System.out.println("AAAAaaaaAAAAAAAAaaaaa44444AAa: " + ex.toString());

        }

    }

    private static boolean isParenthesisMatch(String parenString){

        Stack<Character> parenStack = new Stack<Character>();

        for (int i = 0; i < parenString.length(); i++){

            Character paren = parenString.charAt(i);

            if(paren == '(') parenStack.push(paren);

            else if(paren == ')'){

            if (parenStack.isEmpty()) return  false;

            else if (parenStack.peek() == '(') parenStack.pop();

            else return false;
            }

        }

        if(parenStack.isEmpty()) return true;

        else return false;
    }
}
