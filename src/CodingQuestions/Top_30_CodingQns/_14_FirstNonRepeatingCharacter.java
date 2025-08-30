package CodingQuestions.Top_30_CodingQns;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _14_FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "aabbcddf";
        String ans = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(ans);
    }
}
