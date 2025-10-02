package CodingQuestions.Top_CodingQns;

import java.util.Arrays;

public class _30_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge until one array is exhausted
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
