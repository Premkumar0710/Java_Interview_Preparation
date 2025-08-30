package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem1to5 {
    public static void main(String[] args) {
        // 1. find the word with max length
        String s = "I am learning Streams API in java";
        String ans = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(ans);

        // 2. Remove duplicates & return in same order
        String s1 = "dabcadefg";
        Arrays.stream(s1.split("")).distinct().forEach(System.out::print);

        // alternate method
        String str = Arrays.stream(s1.split("")).distinct().collect(Collectors.joining());
        System.out.println(str);

        System.out.println();

        // 3. Find the highest length (same as qn 1)

        // 4. Find the second highest length
        String s2 = "I am learning Streams API in java";
        String ans1 = Arrays.stream(s2.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
        System.out.println(ans1);

        // 5. Given a sentence, find the occurrence of each word
        String s3 = "I am learning Streams API in java";
        Map<String,Long> ans2 = Arrays.stream(s3.split(" ")).collect(Collectors.groupingBy(str1->str1,Collectors.counting()));
        System.out.println(ans2);

        // vv important Reverse a String in java 8

    }
}
