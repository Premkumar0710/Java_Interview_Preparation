package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OtherImportantProblems {
    public static void main(String[] args) {
        // 1. A list contains duplicate integers. Fetch the top 3 distinct marks.
        List<Integer> list = Arrays.asList(78, 90, 92, 78, 99, 88, 99);
        Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Integer> ans = map.entrySet().stream().filter(n->n.getValue()==1).map(n->n.getKey()).sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println(ans);

        // 2.Give the names that start & end with same character
        String sentence="apple anna civic banana level";
        List<String> sameNames = Arrays.stream(sentence.split(" ")).filter(n->n.charAt(0) == n.charAt(n.length()-1)).toList();
        System.out.println(sameNames);
    }
}
