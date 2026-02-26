import java.util.Scanner;

public class IntegerRecursive{
    // Recursive function
    public static int countDigit(long n, int d) {

        // Make n positive (in case user enters negative number)
        n = Math.abs(n);

        // Base Case:
        // If no digits left, stop recursion
        if (n == 0) {
            return 0;
        }

        // Getsthe last digit
        int lastDigit = (int)(n % 10);

        // Check if last digit matches d
        if (lastDigit == d) {
            // Count 1 + check the rest of the number
            return 1 + countDigit(n / 10, d);
        } else {
            // Just check the rest of the number
            return countDigit(n / 10, d);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a long integer N: ");
        long N = input.nextLong();

        System.out.print("Enter a digit D (0-9): ");
        int D = input.nextInt();

        int result = countDigit(N, D);

        System.out.println("Digit " + D + " appears " + result + " time(s) in " + N);

        input.close();
    }
}
