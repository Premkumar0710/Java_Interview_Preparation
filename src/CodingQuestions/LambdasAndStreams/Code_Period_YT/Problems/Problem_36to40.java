package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem_36to40 {
    public static void main(String[] args) {

        // 36. yet to solve

        // 37. Group them by first character & count the no of strings
        List<String> fruits = Arrays.asList("apple","banana","apricot","cherry","Blueberry","avocado");
        Map<Character,Long> map = fruits.stream().collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
        System.out.println("Qn:37-> " + map);

        // 38 yet to solve

        // 39. Multiply array elements
        Integer []arr = {1,2,3,4,5};
        int mul = Arrays.stream(arr).mapToInt(n->n).reduce(1,(a,b)->a*b);
        System.out.println("Qn:39-> " + mul);

        // 40. Can we reuse streams in java 8?
        List<String> names = Arrays.asList("Alice","Bob","Charlie","Anna");
        Stream<String> nameStream = names.stream();
        //consumption 1
        nameStream.forEach(System.out::print);
        //consumption 2
        long size = nameStream.count(); // illegal state exception

        // we can use supplier
        // Supplier<Stream<String>> nameStream = ()->names.stream(); it will work









    }
}
