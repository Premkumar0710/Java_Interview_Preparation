package InterviewPrep.Collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        // Write a Java program to remove duplicate elements from an ArrayList while maintaining the insertion order.
//        List<Integer> nums = Arrays.asList(1,2,2,3,4,5,6,5,6);
//        Set<Integer> hs = new LinkedHashSet<>(nums);
//        List<Integer> ans = new ArrayList<>(hs);
//        System.out.println(ans);


        List<Student> students = List.of(new Student("Prem",90),
                                    new Student("Swaat",89),
                                    new Student("Ram",76)
        );

        List<Student> res = students.stream().sorted((a,b)->b.getMarks()-a.getMarks()).collect(Collectors.toList());
        System.out.println(res);

        //Write a Java program to find the first non-repeating character in a given string

//        String str = "swiss";
//        Character result = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new , Collectors.counting()))
//                .entrySet().stream().filter(s->s.getValue()==1).findFirst().get().getKey();
//        System.out.println(result);

                List<Integer> nums = Arrays.asList(1,2,2,3,4,5,6,5,6);
                Map<Integer,Long> ans = nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                System.out.println(ans);


    }

}
