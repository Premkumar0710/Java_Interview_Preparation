package CodingQuestions.ImportantBinarySearchProblems;

public class _4_CountOccurencesOfaTargetElement {
    public static int firstOccurence(int arr[], int target){
        int n = arr.length;
        int l=0 , r=n-1;
        int ans = 0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                ans=mid;
                r=mid-1;
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
        int arr[] = {1, 2,2,2,3, 4};
        int target = 2;
        int totalOccurence = firstOccurence(arr,target) + lastOccurence(arr,target) -1 ;
        System.out.println(totalOccurence);

    }
}

