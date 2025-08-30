package CodingQuestions.Top_30_CodingQns;

public class _8_LargestAndSecondLargestElement {
    public static void main(String[] args) {
        int arr[]= {10, 20, 4, 45, 99};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        int secondMax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max)
                secondMax = Math.max(secondMax,arr[i]);
        }

        System.out.print(max+" "+secondMax);
    }
}
