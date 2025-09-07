package CodingQuestions.ImportantAlgorithms;

public class VariableSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int n = arr.length;
        int start = 0, currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end]; // expand window

            // shrink window while condition is satisfied
            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= arr[start];
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No valid subarray found");
        } else {
            System.out.println("Smallest subarray length with sum ≥ " + target + " = " + minLength);
        }
    }
}
