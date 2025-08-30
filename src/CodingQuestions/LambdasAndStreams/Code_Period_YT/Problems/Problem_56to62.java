package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_56to62 {
    public static void main(String[] args) {

        // 56. print the count of a particular substring

        String s = "byebyeBirdiebye!"; // find the count of bye
        Long ans = IntStream.range(0,s.length()-2) // make it dynamic so that whatever input is given works !!
                .filter(x->s.substring(x,x+3).equals("bye")).count();
        System.out.println("Qn:56-> " + ans);

        // 57 -> solved

        // 58. -> solved

        // 60. return the character with max freq
        String s1 = "javadeveloper";
        Character map = s1.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
        System.out.println("Qn:60-> " + map);

        // 61. given a string . return map & its length
        List<String> fruits = Arrays.asList("Orange","banana","kiwi");
        Map<String,Integer> fruitmap = fruits.stream().collect(Collectors.toMap(fruit->fruit,String::length));
        System.out.println("Qn:61-> "+ fruitmap);

       // what if there is 2 kiwi , it will throw exception ; check this

        // 62
    }
}
