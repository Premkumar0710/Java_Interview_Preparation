package CodingQuestions.OtherImportantQnsFromYT;

import java.util.Arrays;
import java.util.List;

public class _3_CanUReuseStreams {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4);
//        int sum = al.stream().filter(n->n>=3).mapToInt(n->n).for;
//        int avg = al.stream()
                // once terminal operation is done we cannot reuse streams again as it will throw illegal state exception
    }
}
