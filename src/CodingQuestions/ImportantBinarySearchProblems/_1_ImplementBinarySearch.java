package CodingQuestions.ImportantBinarySearchProblems;

public class _1_ImplementBinarySearch {
    public static int binarySearch(int arr[], int target){
        int n = arr.length;
        int l=0 , r=n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                l = mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        Find the occurrence of an element in a sorted array
//         Output: 1 (index of first 2)
        int arr[] = {1,2,2,2,3,4};
        int target = 2;
        System.out.println(binarySearch(arr,target));



    }
}
