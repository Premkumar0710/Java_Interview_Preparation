package CodingQuestions.Top_CodingQns;

public class _26_SwapWithoutTempVariable {
    public static void main(String[] args) {
        int a = 20 , b=30;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a : " + a + " | b : "+ b);
    }
}
