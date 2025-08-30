package CodingQuestions.LambdasAndStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInterviewQns {
 // Assignment qns
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.forEach((n)-> System.out.print(n*n + " "));
        System.out.println();

        numbers.stream().filter(n->n%2==0).forEach(n-> System.out.print(n +" "));
        System.out.println();

        List<Integer> squares = numbers.stream().map(n->n*n).collect(Collectors.toList());
        System.out.print(squares);
        System.out.println();

        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> length = names.stream().map(str->str.length()).toList();
        System.out.print(length);
        System.out.println();

        List<String> filteredNames = names.stream().filter(str->!str.startsWith("T")).map(str->str.toUpperCase()).toList();
        System.out.print(filteredNames);
        System.out.println();

        int sum = numbers.stream().map(n->n*n).reduce(0,(n1,n2)-> n1+n2);
        System.out.println(sum);

        // Ass : 15
        Optional<String> firstname = names.stream().filter(n->n.length()>10).findFirst();
        System.out.println(firstname);

        // Ass : 11
        Optional<Integer> maxNum = numbers.stream().reduce((n1,n2)-> n1>n2 ? n1 : n2);
        System.out.println(maxNum);

    }

    public static class StreamsInterviewQn {

        // yt link : https://www.youtube.com/watch?v=nDceCubB3Yg
        
        public static void main(String[] args) {
            List<Integer> nums = Arrays.asList(10,20,30,30,40,50,51);
            // 1. Find first element

           // System.out.println(nums.stream().findFirst()); optional[10]
            nums.stream().findFirst().ifPresent(System.out::println);

            // 2. find count of elements
            System.out.println(nums.stream().count());

            // 3. find out odd & even numbers
            List<Integer> even = nums.stream().filter(n-> n%2==0).collect(Collectors.toList());
            System.out.println(even);

            nums.stream().filter((n->n%2==1)).forEach(System.out::print);         // alternate method for odd

            // 4. find out no that starts with 5
            nums.stream().filter(n->n.toString().startsWith("5")).forEach(System.out::print);

            // 5. Find duplicate
            Set<Integer> temp = new HashSet<>();
            nums.stream().filter(n-> !temp.add(n)).forEach(System.out::println); // wrong op ; check

            // 6. Find max & min value
            Optional<Integer> max = nums.stream().max(Integer::compareTo);
            Optional<Integer> min = nums.stream().min(Integer::compareTo);
            System.out.println(max.orElse(null));

            // 7. sort in asc & desc order (Accenture Interview)
            nums.stream().sorted().forEach(System.out::println);
            nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

            // 8. duplicate in arrays
            int[] num = {1,1,2,2,3,4,5};
          //  List<Integer> reslist = Arrays.stream(num).distinct().collect();  // checkthis

            // 9. sq of numbers > 50
            nums.stream().map(n->n*n).filter(n->n>50).forEach(System.out::println);

            // 10 . Program to sort an array ; convert sorted array to streams
            Arrays.sort(num);
            Arrays.stream(num).forEach(System.out::println);

            /* Medium level qns */

            // 11. Conv string to uppercase
            List<String> words = Arrays.asList("Hi","all","how","are","you","Hi","all");
            words.stream().map(s->s.toUpperCase()).forEach(System.out::println);

            // 12. Max element in an array
            Arrays.stream(num).max().ifPresent(System.out::println);

            // 13. Concatenate 2 streams
            Stream<Integer> s1 = Stream.of(1,2,3);
            Stream<Integer> s2 = Stream.of(4,5,6);
            Stream.concat(s1,s2).forEach(System.out::println);

            // 14. 10 Random numbers using stream (Interview qn)
            Random random = new Random();
            Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

            // 15. count the occurrence of a particular value
            long countval = nums.stream().filter(n->n==50).count();

            // 16. sum of salary of all employees
            List<Integer> salary = Arrays.asList(1000,2000,3000);
          //  salary.stream().reduce(0, n->n+0). check

            // last 5 qns pending

        }
    }
}
