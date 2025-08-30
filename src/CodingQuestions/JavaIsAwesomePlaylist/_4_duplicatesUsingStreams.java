package CodingQuestions.JavaIsAwesomePlaylist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _4_duplicatesUsingStreams {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,1,2,2,3,4,5);

        Map<Integer,Long> map = al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Integer> duplicateList = map.entrySet().stream().filter(n->n.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(duplicateList);
    }
}
