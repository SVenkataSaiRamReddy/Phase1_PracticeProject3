import java.util.Scanner;

public class SumInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the lower bound (L): ");
        int L = scanner.nextInt();

        System.out.print("Enter the upper bound (R): ");
        int R = scanner.nextInt();

        int sum = sumRange(arr, n, L, R);
        System.out.println("Sum of elements from " + L + " to " + R + ": " + sum);
    }

    public static int sumRange(int[] arr, int n, int L, int R) {
        // Handle edge cases
        if (L < 0 || L >= n) {
            throw new IllegalArgumentException("L must be within the range [0, n-1]");
        }
        if (R < 0 || R >= n) {
            throw new IllegalArgumentException("R must be within the range [0, n-1]");
        }
        if (L > R) {
            throw new IllegalArgumentException("L cannot be greater than R");
        }

        // Calculate prefix sums
        int[] prefixSums = new int[n];
        prefixSums[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSums[i] = prefixSums[i - 1] + arr[i];
        }

        // Return the sum of elements in the range
        return prefixSums[R] - (L > 0 ? prefixSums[L - 1] : 0);
    }
}
