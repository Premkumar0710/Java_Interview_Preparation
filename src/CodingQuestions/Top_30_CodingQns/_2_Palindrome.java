package CodingQuestions.Top_30_CodingQns;

import java.util.Scanner;

public class _2_Palindrome {

    public static boolean isPalindrome(String s){
        int n = s.length();
        String reversed = "";
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            reversed+=ch;
        }
        if(s.equals(reversed)){return true;}
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(_2_Palindrome.isPalindrome(s));
    }
}
