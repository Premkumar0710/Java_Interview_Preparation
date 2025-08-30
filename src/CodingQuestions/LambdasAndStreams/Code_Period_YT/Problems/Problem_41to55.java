package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem_41to55 {
    public static void main(String[] args) {

        // 41. Conv all strings to uppercase & then concat to a string
        List<String> alp = Arrays.asList("a","b","c","d");
        String concat = alp.stream().map(s->s.toUpperCase()).reduce((s1,s2)->s1+" "+s2).orElse("");
        System.out.println("Qn:41-> " + concat);

        String ress = alp.stream().map(m->m.toUpperCase()).collect(Collectors.joining());
        System.out.print("Qn:41-> " + ress);

        // 42. Map() & flatMap()

        // 43. Concatenate 2 streams
        Stream<String> s1 = Stream.of("Java","Python");
        Stream<String> s2 = Stream.of("C++","C#");
        List<String> concat1 = Stream.concat(s1,s2).toList();
        System.out.println("Qn:43-> " + concat1);

        // 44. Common pitfalls to avoid in streams

        // 45. Solved

        // 46.

        // 47.

        // 48. just revise


        // 52. Find middle character of the String
        String s = "Education";
        int len = s.length();
        int middleIndex = len / 2;
        String middleChar = IntStream.range(0, s.length())
                .filter(i -> i == middleIndex)
                .mapToObj(s::charAt)
                .map(String::valueOf)
                .findFirst()
                .orElse("");

        System.out.println("Qn:52 -> Middle character: " + middleChar);

        // 53. Print all distinct numbers in desc order starts with 1
        int[] arr = {12,34,11,34,67,121,121,52,78,114,565,1642,11};

        List<Integer> res = Arrays.stream(arr).distinct().filter(n->String.valueOf(n).startsWith("1"))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Qn:53-> " + res);

        // 54.

        // 55.
    }
}
