package CodingQuestions.Top_CodingQns;

public class _18_BinarySearch {

    public static  int BinarySearch(int arr[],int target){
        int l=0 , r=arr.length-1;
        while(l<=r){
            int m = (l+r)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m]<target){
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 3;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);

    }
}
