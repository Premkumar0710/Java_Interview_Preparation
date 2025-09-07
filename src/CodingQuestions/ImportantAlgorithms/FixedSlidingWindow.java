package CodingQuestions.ImportantAlgorithms;

public class FixedSlidingWindow {
    public static void main(String[] args) {

        // fixed sliding window
        int arr[] = {2, 1, 5, 1, 3, 2};
        int n = arr.length;
        int k = 3;
        int sum =0;

        // sum of k elements
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int maxSum = sum;

        for(int i=k;i<n;i++){
            sum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,sum);
        }

        System.out.println("Maximum sum of subarray of size " + k + " = " + maxSum);

        /*
        class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int tempSum = 0;

        // calculate first window sum
        for (int i = 0; i < k; i++) {
            tempSum += nums[i];
        }

        double maxAvg = (double) tempSum / k;  // use double

        // sliding window
        for (int end = k; end < nums.length; end++) {
            tempSum += nums[end] - nums[end - k];  // slide the window
            double tempAvg = (double) tempSum / k;
            maxAvg = Math.max(maxAvg, tempAvg);
        }

        return maxAvg;
    }
}
         */


    }
}
