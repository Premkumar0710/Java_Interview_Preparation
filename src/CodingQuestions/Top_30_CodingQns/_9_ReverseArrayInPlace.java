package CodingQuestions.Top_30_CodingQns;

import java.util.Arrays;

public class _9_ReverseArrayInPlace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        int l = 0, r=n-1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
