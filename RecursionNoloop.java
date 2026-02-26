//starting
import java.util.Scanner;

public class RecursionNoloop {

    // Recursive function to calculate length of string
    public static int length(String s) {
        // Base case: will be an empty string
        if (s.equals("")) { //empty string if there was a number here it wouldn't be a base case
            return 0;
        }
        // Recursive case
        return 1 + length(s.substring(1)); //returns the number of characters in S recursively.
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String S = scanner.nextLine(); //reads the full line including any spaces

        int recursivelength = length(S); //calls the function

        System.out.println("Length of the string: " + recursivelength); //prints function

        scanner.close();
    }
}