package CodingQuestions.Top_30_CodingQns;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _15_CountEachOccurence {
    public static void main(String[] args) {
        String s = "hello";
        Map<String,Long> map = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);
    }
}
