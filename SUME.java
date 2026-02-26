import java.util.Scanner;
 
public class SUME{

    // Recursive function to return sum of even numbers
    public static int sumEven(int[] A, int size) {

        // Base Case: when element amount is = 0
        if (size == 0) {
            return 0;
        }

        // Checks the last element
        int lastElement = A[size - 1];

        // If last element is even
        if (lastElement % 2 == 0) {
            return lastElement + sumEven(A, size - 1);
        } else {
            return sumEven(A, size - 1);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = input.nextInt();

        int[] A = new int[n];

        System.out.println("Enter " + n + " integers:");

        // Loop is to grab more integers
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        int sum = sumEven(A, n);

        // Only main prints
        System.out.println("Sum of even integers is " + sum);

        input.close();
    }
}
