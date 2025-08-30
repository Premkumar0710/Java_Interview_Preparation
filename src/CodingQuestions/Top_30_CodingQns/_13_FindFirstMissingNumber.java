package CodingQuestions.Top_30_CodingQns;

public class _13_FindFirstMissingNumber {

    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        for (int i = 0; i < arr.length; i++) {
            // Expected value at index i is (arr[0] + i)
            int expected = arr[0] + i;
            if (arr[i] != expected) {
                System.out.println("First missing number is: " + expected);
                break;
            }
        }
    }
}
