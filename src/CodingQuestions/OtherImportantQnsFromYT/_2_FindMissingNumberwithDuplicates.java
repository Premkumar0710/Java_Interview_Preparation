package CodingQuestions.OtherImportantQnsFromYT;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class _2_FindMissingNumberwithDuplicates {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 3, 3, 4, 4, 5, 7, 8, 9, 1};
        int n = arr.length;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            maxNum = Math.max(maxNum, arr[i]);
        }
        // remove duplicates
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= maxNum; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
