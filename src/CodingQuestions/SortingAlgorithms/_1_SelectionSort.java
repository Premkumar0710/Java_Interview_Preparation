package CodingQuestions.SortingAlgorithms;

import java.util.Arrays;

public class _1_SelectionSort {

    public static void main(String[] args) {
        // Selection Sort: Pick the minimum element and place it at the correct position
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update the index of min element
                }
            }

            // swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
