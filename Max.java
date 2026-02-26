import java.util.Scanner;

public class Max {
  // Recursive method to find array maximum
    public static int max(int[] A, int size) {

        // Base Case: for one element
        if (size == 1) {
            return A[0];
        }

        //Find max of the first (size - 1) element
        int maxof1 = max(A, size - 1);

        // Compare last element with max of the rest
        if (A[size - 1] > maxof1) {
            return A[size - 1];
        } else {
            return maxof1;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Integers in array: ");
        int n = input.nextInt();

        int[] A = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {  //doing a loop here so we can continue to input
            A[i] = input.nextInt();
        }

        int result = max(A, n);

        System.out.println("Maximum value is: " + result);

        input.close();
    }
}
