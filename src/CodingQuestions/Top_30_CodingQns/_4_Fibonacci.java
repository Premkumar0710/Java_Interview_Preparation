package CodingQuestions.Top_30_CodingQns;

public class _4_Fibonacci {

    public static void main(String[] args) {
        int n = 6;  // Number of terms
        int n1 = 0, n2 = 1;

        System.out.print(n1 + "," + n2 + ",");

        for (int i = 1; i <= n - 2; i++) {
            int res = n1 + n2;
            System.out.print(res + (i < n - 2 ? "," : ""));  // Avoid comma at the end
            n1 = n2;
            n2 = res;
        }
    }
}
