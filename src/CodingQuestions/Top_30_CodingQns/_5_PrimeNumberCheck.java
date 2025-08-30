package CodingQuestions.Top_30_CodingQns;

import java.util.Scanner;

public class _5_PrimeNumberCheck {

    public static int factors(int n){
        int factorCount = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factorCount ++;
            }
        }
        return factorCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorCount = _5_PrimeNumberCheck.factors(n);
        if(factorCount==2){
            System.out.println(n+" is prime.");
        }
        else {
            System.out.println(n+ " is composite.");
        }
    }
}
