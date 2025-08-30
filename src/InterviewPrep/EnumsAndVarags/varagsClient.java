package InterviewPrep.EnumsAndVarags;

public class varagsClient {
    static int sum = 0;
    public static int nums(int a, int... n){
        // POV - I'm not using a anywhere
        for(Integer i : n){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int ans = nums(1, 1,2,3,4);
        System.out.println(ans);
    }

}
