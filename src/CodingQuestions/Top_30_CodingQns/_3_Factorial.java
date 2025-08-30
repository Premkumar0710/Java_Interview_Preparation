package CodingQuestions.Top_30_CodingQns;

import java.util.Scanner;

public class _3_Factorial {

    public static long factorial(long n){
        int fact = 1;
        for(long i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(_3_Factorial.factorial(n));
    }
}
