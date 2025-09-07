package CodingQuestions.ImportantAlgorithms;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int pf[] = new int[arr.length];
        // prefix sum array calculation
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(pf));

        // Range sum - calculate sum range between index 0 & 3
        int l = 0, r = 3;
        if (l == 0) {
            System.out.println(pf[r]);
        } else {
            System.out.println(pf[r] - pf[l - 1]);
        }
    }
}
