package CodingQuestions.JavaIsAwesomePlaylist;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _7_FirstRepeatedCharacterUsingStreams {
    public static void main(String[] args) {

        String s = "Java is Awesome";
        Map<Character,Long>  map = s.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Character ans = map.entrySet().stream().filter(n->n.getValue()>1).map(n->n.getKey()).findFirst().get();
        System.out.println(ans);

    }
}
