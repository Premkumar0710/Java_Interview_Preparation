package CodingQuestions.Top_CodingQns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _37_AllPairsWithSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;

        // Step 1: Count frequency of elements
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<String> result = new ArrayList<>();

        // Step 2: Find pairs
        for (int num : arr) {
            int complement = targetSum - num;

            if (freqMap.getOrDefault(num, 0) > 0 && freqMap.getOrDefault(complement, 0) > 0) {
                // Avoid counting same pair twice
                if (num == complement && freqMap.get(num) < 2) continue;

                result.add("(" + num + "," + complement + ")");

                // Decrement counts
                freqMap.put(num, freqMap.get(num) - 1);
                freqMap.put(complement, freqMap.get(complement) - 1);
            }
        }

        System.out.println(result);
    }
}
