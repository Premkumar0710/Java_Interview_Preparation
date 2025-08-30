package CodingQuestions.Top_30_CodingQns;

import java.util.Arrays;

public class _12_MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,3,5};
        int arr2[] = {2,4,6};

        int ans[] = new int[arr1.length + arr2.length];
        int a1=0,a2=0;
        for(int i=0;i<ans.length;i++){
            if(arr1[a1]<arr2[a2]){
                ans[i] = arr1[a1];
                a1++;
            }
            else {
                ans[i] = arr2[a2];
                a2++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
// import java.util.Arrays;
//
//public class _12_MergeSortedArrays {
//    public static void main(String[] args) {
//        int arr1[] = {1, 3, 5};
//        int arr2[] = {2, 4, 6};
//
//        int[] ans = new int[arr1.length + arr2.length]; // size = 6
//        int a1 = 0, a2 = 0, i = 0;
//
//        // STEP 1: Merge till one array is finished
//        while (a1 < arr1.length && a2 < arr2.length) {
//            if (arr1[a1] < arr2[a2]) {
//                ans[i] = arr1[a1];
//                a1++;
//            } else {
//                ans[i] = arr2[a2];
//                a2++;
//            }
//            i++;
//        }
//
//        // STEP 2: Copy leftovers from arr1 (if any)
//        while (a1 < arr1.length) {
//            ans[i] = arr1[a1];
//            a1++;
//            i++;
//        }
//
//        // STEP 3: Copy leftovers from arr2 (if any)
//        while (a2 < arr2.length) {
//            ans[i] = arr2[a2];
//            a2++;
//            i++;
//        }
//
//        System.out.println("Merged array: " + Arrays.toString(ans));
//    }
//}