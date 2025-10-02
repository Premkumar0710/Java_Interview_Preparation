package CodingQuestions.Top_CodingQns;

public class _20_AmstrongNumber {
    public static boolean isAmstring(int input) {
        int temp = input;   // keep original number
        int amstSum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            amstSum += rem * rem * rem; // cube each digit and add
            temp = temp / 10;
        }
        return input == amstSum;
    }

    public static void main(String[] args) {
        System.out.println(isAmstring(153)); // true
        System.out.println(isAmstring(370)); // true
        System.out.println(isAmstring(123)); // false
    }
}
