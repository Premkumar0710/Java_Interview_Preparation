package CodingQuestions.SortingAlgorithms;

import java.util.Arrays;

public class _2_BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        // Outer loop -> number of passes (n-1 passes needed)
        for (int i = 0; i < n - 1; i++) {

            // Inner loop -> compare adjacent elements
            // After each pass, the largest element "bubbles" to the end
            for (int j = 0; j < n - i - 1; j++) {

                // If current element is greater than next element -> swap
                if (arr[j] > arr[j + 1]) {
                    // Swap using a temporary variable
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
