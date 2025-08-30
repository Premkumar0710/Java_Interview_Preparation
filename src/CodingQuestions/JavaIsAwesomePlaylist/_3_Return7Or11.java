package CodingQuestions.JavaIsAwesomePlaylist;

public class _3_Return7Or11 {

    public static int test(int n){
        return 7+11-n;
    }

    public static void main(String[] args) {
        // If the input is 7 return 11 , if input is 11 return 7
        // Don't use if-else
        System.out.println(test(7));
        System.out.println(test(11));
    }
}
