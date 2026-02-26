import java.util.Scanner;

public class Max{

    private static int max  [] A, int index) {
        // Base case: last element
        if (index == A.length - 1) {
            return A[index];
        }

        // Recursive case: max of the whole array
        int maxOfRest = max, index + 1);

        // Compare the current element with the maximum of the others in the array
        return (A[index] > maxOfO) ? A[index] : maxOfO;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Number of integers");
        int n = in.nextInt();

        int[] A = new int[n];

        System.out.println("Enter " + n + " integer:");
        for (int i = 0; i < n; i++) {   //loop to keep collecting input
            A[i] = in.nextInt();
        }

        int answer = max(A);
        System.out.println("Max value = " + answer);

        in.close();
    }
}