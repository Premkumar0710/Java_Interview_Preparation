package CodingQuestions.Top_CodingQns;

import java.util.HashSet;
import java.util.Set;

public class _35_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        /*
        Input: "abcabcbb"
        Output: 3 → ("abc")
        Input: "bbbbb"
        Output: 1 → ("b")
         */
        String input = "abcabcbb";
        int n = input.length();
        int start = 0, end = 0;
        int longestSubsStr = 0;

        Set<Character> hs = new HashSet<>();

        while (end < n) {
            char ch = input.charAt(end);

            // If duplicate, shrink from left until it's gone
            while (hs.contains(ch)) {
                hs.remove(input.charAt(start));
                start++;
            }

            // Add current character
            hs.add(ch);

            // Update longest length
            longestSubsStr = Math.max(longestSubsStr, end - start + 1);

            end++;
        }

        System.out.println(longestSubsStr); // Expected: 3
    }
}
