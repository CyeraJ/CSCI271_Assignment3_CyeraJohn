import java.util.Scanner;

public class SBackwards {
     public static String back(String S) {
        // Base case: will be an empty string
        if (S.length() < 1) {
            return S;
        }
        // Recursive case that everses the output
       return S.charAt(S.length() - 1) + back(S.substring(0, S.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String S = scanner.nextLine(); //reads everything in that line including spaces

      String backward  = back(S);

        System.out.println("String backwards is: " + backward);

        scanner.close();
    }
}
