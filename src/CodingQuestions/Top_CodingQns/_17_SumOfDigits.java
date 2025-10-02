package CodingQuestions.Top_CodingQns;

public class _17_SumOfDigits {
    public static void main(String[] args) {
        int n = 123445566;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}
