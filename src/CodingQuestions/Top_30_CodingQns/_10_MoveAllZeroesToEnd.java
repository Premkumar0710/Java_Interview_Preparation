package CodingQuestions.Top_30_CodingQns;

import java.util.Arrays;

public class _10_MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = arr.length;
        int index = 0;

        // gathered all non zeroes in order
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }

        // Now fill the rest with 0
        for(int i=index;i<n;i++){
            arr[i]=0;
        }

        System.out.print(Arrays.toString(arr));
    }
}
