package CodingQuestions.ImportantBinarySearchProblems;

public class _5_WhereTargetIsInserted {

    public static int insertElement(int arr[], int target){
        int n = arr.length;
        int l=0,r=n-1;
        int ans = n; // important step
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>=target){
                ans = mid;
                r= mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int target = 7;
        System.out.println(insertElement(arr,target));
    }
}
