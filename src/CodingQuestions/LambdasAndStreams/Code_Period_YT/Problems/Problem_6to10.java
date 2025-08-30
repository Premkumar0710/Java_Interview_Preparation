package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_6to10 {
    public static void main(String[] args) {

        // 6. Find the word with a specified number of vowels , N=2
        String s = "I am learning Streams API in java";
        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2).forEach(System.out::println);

        // 7. Given a list of integers, divide it into two lists (odd & even)
        int[] arr = {1,2,3,4,5,6,7,8};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
//      Map<Boolean,Listlist.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()))

        // 8. Find the occurence of each character
        String sr = "Mississippi";
        Map<String,Long> charOccurence = Arrays.stream(sr.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(charOccurence);

        // 9. re-arrange the elements to highest / lowest possible value
        int[] arr1 = {1,2,3,4,5,6,7,8};
        Arrays.stream(arr1).mapToObj(x->x).sorted().forEach(System.out::print);
        System.out.println();
        Arrays.stream(arr1).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::print);
        System.out.println();

        // 10. Find the sum of unique elements
        int[] arr2 = {1,6,7,8,1,1,8,8,7};
        System.out.println(Arrays.stream(arr).distinct().sum());
        // alternate method
        List<Integer> intlist = Arrays.stream(arr2).boxed().toList();
        int summ = intlist.stream().distinct().mapToInt(n->n).sum();
        // or
        int sum = intlist.stream().distinct().reduce(0,(a,b)->a+b);



    }
}
