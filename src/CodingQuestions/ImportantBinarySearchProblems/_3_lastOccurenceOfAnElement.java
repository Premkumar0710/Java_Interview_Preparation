package CodingQuestions.ImportantBinarySearchProblems;

public class _3_lastOccurenceOfAnElement {

    public static int lastOccurence(int arr[], int target){
        int n = arr.length;
        int l=0 , r=n-1;
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                ans=mid;
                l=mid+1;
            }
            else if(arr[mid]<target){
                l = mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2, 3, 4};
        int target = 2;
        System.out.println(lastOccurence(arr, target));
    }
}

