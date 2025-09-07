package CodingQuestions.ImportantAlgorithms;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxSum = Math.max(sum,maxSum);
            // reset to 0 if it becomes negative ; our end goal is to find max sub array sum
            if(sum<0) sum = 0;
        }
        System.out.println(sum);
    }
}
