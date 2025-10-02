package CodingQuestions.Top_CodingQns;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class _36_KthLargestElement {
    public static void main(String[] args) {
        /*
        Example
        Input: [3,2,1,5,6,4], k=2
        Output: 5 (second largest)
         */
        int arr[] = {3,2,1,5,6,4};
        int n = arr.length;
        int k = 2;
        // Method 1 : inbuilt sort
        Arrays.sort(arr);
        System.out.println(arr[n-k]);

        // Method 2 : Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int nums : arr){
            pq.add(nums);
        }
        for(int i=1;i<k;i++){
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}
