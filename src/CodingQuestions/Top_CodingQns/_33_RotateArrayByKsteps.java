package CodingQuestions.Top_CodingQns;

import java.util.Arrays;

public class _33_RotateArrayByKsteps {
    public static void reverseArray(int input[],int start, int end){
        int n = input.length;
            while(start<end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
//        Rotate an array by K steps
//        Input: [1,2,3,4,5,6,7], k=3
//        Output: [5,6,7,1,2,3,4]
        int input[] = {1,2,3,4,5,6,7};
        int k = 3;
        int n = input.length;
        reverseArray(input,0,n-1);
        reverseArray(input,0,k-1);
        reverseArray(input,k,n-1);
        System.out.println(Arrays.toString(input));
    }
}
