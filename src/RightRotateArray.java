public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array
        int steps = 5; // Number of steps to rotate

        System.out.println("Original Array:");
        printArray(arr);

        rightRotate(arr, steps);

        System.out.println("\nArray after right rotation by " + steps + " steps:");
        printArray(arr);
    }

    // Function to right rotate the array by 'steps' steps
    public static void rightRotate(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length; // To handle cases where steps > length

        reverseArray(arr, 0, length - 1); // Reverse entire array
        reverseArray(arr, 0, steps - 1); // Reverse first 'steps' elements
        reverseArray(arr, steps, length - 1); // Reverse remaining elements after 'steps'
    }

    // Function to reverse the elements of the array within a specified range
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
