package CodingQuestions.Top_30_CodingQns;

import java.util.Arrays;
import java.util.List;

public class _27_ReverseWordsInAString {
    public static void main(String[] args) {
        String sentence = "Java Coding Interview";
        List<String> al = Arrays.stream(sentence.split(" ")).toList();
        for(int i=al.size()-1;i>=0;i--){
            System.out.print(al.get(i) + " ");
        }

    }
}
