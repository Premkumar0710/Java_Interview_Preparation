package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem_11to15 {
    public static void main(String[] args) {
        // 11. Find first non-repeated character
        String s = "Hello world";
        String ans = Arrays.stream(s.split("")).filter(c->s.indexOf(c)==s.lastIndexOf(c)).findFirst().get();
        System.out.println("Solution for qn 11 is : " + ans);

       /*  alternate method
        Map<Character,Long> characterMap = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()));
        String ans1 = characterMap.entrySet().stream().filter(m->m.getValue()==1).map(m->m.getKey()).findFirst().get();
        System.out.println(ans1);*/


        // 12. Find the first repeated character
        String s1 = "Hello world";
        Map<Character,Long> cmap = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        char ans2 = cmap.entrySet().stream().filter(m->m.getValue()>1).map(m->m.getKey()).findFirst().get();
        System.out.println("Solution for qn 12 is : " +ans2);

        // 13. Given array of integers , group the numbers by the range in which they belong
        int[] arr = {2,3,10,14,20,24,30,34,40,50,54};
        List<Integer> list = Arrays. stream(arr) .boxed () .collect (Collectors.toList());
        Map<Integer, List<Integer>> mapListing =list.stream()
                .collect(Collectors.groupingBy(x->x/10*10,
                        LinkedHashMap :: new, Collectors.toList()));

        System.out.println("Solution for qn 13 is : " + mapListing);

        // 14. filter out the numerical values
        String[] s4 = {"abc","123", "456", "xyz"};

        List<Integer> ans4 =Arrays.stream(s4)
                .filter (x->x.matches("[0-9]+")).map(Integer :: valueOf)
                .collect(Collectors.toList());

        System.out.println("Solution for qn 14 is : " +ans4);

        // 15. find the product of first two numbers
        int[] arr5 = {12,5,6,9,2,4};
        int ans5 =Arrays.stream(arr5).boxed().collect(Collectors.toList())
                .stream().limit(2).reduce(1,(a,b)->a*b);
        System.out.println("Solution for qn 15 is : " + ans5);

        // 17. find the product of alternate numbers
        int[] arr6 = {12, 5, 6, 9, 2, 4};
        List<Integer> list1 = Arrays.stream(arr6).boxed().collect(Collectors.toList());

        // Use indexOf (works only if all elements are unique)
        int ans6 = list1.stream()
                .filter(n -> list1.indexOf(n) % 2 == 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Solution for qn 17 is : " + ans6); // Output: 144


    }


}
