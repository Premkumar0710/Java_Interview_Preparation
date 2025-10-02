package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_16to20 {
    public static void main(String[] args) {

        // 16. Remove duplicates & return in same order
        String s = "dabcadefg";
        // method 1
        s.chars().distinct().mapToObj(c->(char)c).forEach(System.out::print);
        // method 2
        System.out.println();
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
        System.out.println();

        // how to collect this in a variable ?
        String joinDistinct = s.chars().distinct().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(joinDistinct);

        // 17. multiply alternate nums in an array
        int arr[] = {4,5,1,7,2,9,2};
        int sumOfProd = IntStream.range(0,arr.length).filter(x->x%2==0).map(x->arr[x]).reduce(1,(a,b)->a*b);
        System.out.println(sumOfProd);


        // 18. Multiply 1st & last , 2nd & 2nd last & etc....
        int arr1[] = {4,5,1,7,2,9,2};
        IntStream.range(0,arr1.length/2).map(x->arr1[x]*arr1[arr1.length-x-1]).forEach(System.out::println);

        // 19.

        // 20. Print true or false if it has distinct values
        int arr20[] = {5,0,1,0,8,0};
        List<Integer> list = Arrays.stream(arr20).boxed().toList();
        Map<Integer,Long> mapcount = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        List<Long> values = mapcount.values().stream().toList();
        Boolean finalRes = values.stream().noneMatch(x->x>1);
        System.out.println("Qn 20 : " + finalRes);


    }
}
