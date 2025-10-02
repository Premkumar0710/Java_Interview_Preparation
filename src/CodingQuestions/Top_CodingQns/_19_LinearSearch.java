package CodingQuestions.Top_CodingQns;

public class _19_LinearSearch {

    public static int LinearSearch(int arr[],int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 3;
        int ans = LinearSearch(arr,target);
        System.out.println(ans);
    }
}
