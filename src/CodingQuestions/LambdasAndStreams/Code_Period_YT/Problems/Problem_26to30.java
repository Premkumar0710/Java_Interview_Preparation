package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem_26to30 {
    public static void main(String[] args) {

        // 26. Find the union of Integers
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(6,7,8,9,10);
        List<Integer> union = Stream.concat(l1.stream(),l2.stream()).toList();
        System.out.println("Qn:26-> " + union);

        // 27. Find kth smallest element
        List<Integer> list = Arrays.asList(7,1,6,2,3,4,5);
        int k = 3;
        int value = list.stream().sorted(Comparator.naturalOrder()).skip(k-1).findAny().get();
        System.out.println("Qn:27-> " + value);

        // 28. Remove all non-numeric characters from a list
        List<String> str = Arrays.asList("alb12c3","la2b3c");
        List<String> ansNonNumbers = str.stream()
                .map(s -> s.replaceAll("[^0-9]", "")) // remove non-digits
                .collect(Collectors.toList());
        System.out.println("Qn:28-> " + ansNonNumbers);

        // 29. Print strings that contain only digits
        List<String> list1 = Arrays.asList("123","abc","123abc");
        List<String>onlydigits = list1.stream().filter(n->n.matches("[0-9]+")).toList();
        System.out.println("Qn:29-> "+ onlydigits);

        // 30. List of string to uppercase
        List<String> series = Arrays.asList("Breaking bad","Game of thrones");
        List<String> uppCase = series.stream().map(s->s.toUpperCase()).toList();
        System.out.println("Qn:30-> " + uppCase);
    }
}
