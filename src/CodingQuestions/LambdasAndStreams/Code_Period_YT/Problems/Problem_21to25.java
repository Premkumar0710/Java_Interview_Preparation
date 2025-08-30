package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem_21to25 {
    public static void main(String[] args) {

        // 21. group by middle characters
        String str[] = {"ewe","jji","jhj","kwk","aha"};
        System.out.println(Stream.of(str).collect(Collectors.groupingBy(x->x.toString().substring(1,2)))
);
        // 22. Find the sum of all the elements
        List<Integer> num = Arrays.asList(1,2,3,4,5); // boxed
        int sum = num.stream().mapToInt(n->n).sum();
        System.out.println("Qn:22-> " + sum);
        // alternate method
//        int sum1 = num.stream().mapToInt(n->n).reduce(0,(a,b)->a+b);
//        System.out.println(sum1);

        // 23. sort in alphabetical order
        List<String> s= Arrays.asList("Zudio","Puma","Adidas","MAC");
        List<String> resOp = s.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Qn:23-> " + resOp);

        // 24. Conv list of integers to list of square
        List<Integer> nums1 = List.of(1,2,3,4,5);
        List<Integer> sq = nums1.stream().map(n->n*n).toList();
        System.out.println("qn:24-> " + sq);

        // 25. Find & print distinct odd nos
        List<Integer> nums2 = Arrays.asList(1,2,3,4,5,6,8,9,9,10);
        List<Integer> distinct = nums2.stream().filter(n->n%2==1).distinct().toList();
        System.out.println("Qn:25-> " + distinct);

    }
}
