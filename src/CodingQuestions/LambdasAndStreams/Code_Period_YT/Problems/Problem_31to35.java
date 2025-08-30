package CodingQuestions.LambdasAndStreams.Code_Period_YT.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Problem_31to35 {
    public static void main(String[] args) {

        // 31. Average of all the numbers
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        // method 1
        double avg = l.stream().mapToDouble(n->n).average().getAsDouble();
        System.out.println("Qn:31-> " + avg);
        // method 2
        double avg1 = l.stream().mapToDouble(n->n).reduce(0,(a,b)->a+b/l.size());
        System.out.println("Qn:31-> " + avg1);

        // 32. Intersection of 2 lists
        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(3,5,6,7);
        List<Integer>concat = l1.stream().filter(l2::contains).toList();
        // List<Integer>concat = l1.stream().filter(n->l2.contains(n)).toList(); Without method reference
        System.out.println("Qn:32-> "+ concat);

        // alternate method
        List<Integer> concat1 = Stream.concat(l1.stream(),l2.stream()).toList();
        List<Integer> finalConcat = concat1.stream().distinct().toList();

        // 33. Find the occurrence of domains using Java streams

        // 34. Generate first 10 numbers of fibonacci series (sum of last 2 nos)
        int a=0, b=1;
        System.out.print(a+" ");
        for(int i=1;i<10;i++){
            System.out.print(b+" ");
            int sum = a+b;
            a = b;
            b = sum;
        }

        // Using streams
        // learn

        // 35. List of Integers to their squares
        List<Integer> l5 = Arrays.asList(1,2,3,4,5);
        List<Integer> sqs = l5.stream().map(n->n*n).toList();
        System.out.println(sqs);

        // It's already solved check something has been missed

    }
}
