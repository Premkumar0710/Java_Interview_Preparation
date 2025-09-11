package CodingQuestions.LambdasAndStreams.Code_Period_YT.BigProblems.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student(1,"Ram",99,"Chennai"),
                new Student(2,"Som",90,"Bangalore"),
                new Student(4,"Prem",100,"Pondicherry"),
                new Student(3,"Moom",67,"Chennai")
        );

        List<String> names = studentList.stream().filter(n->n.getMarks()>75).map(m->m.getName()).toList();
        System.out.println(names);

        String name = studentList.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).map(n->n.getName()).findFirst().get();
        System.out.println(name);

        Map<String, Long> map = studentList.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting()));
        System.out.println(map);

        // average marks for each city
        Map<String,Double> map1 = studentList.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.averagingDouble(Student::getMarks)));
        System.out.println(map1);

        // average of all
        double average = studentList.stream().mapToDouble(n->n.getMarks()).average().getAsDouble();
        System.out.println(average);

        // count of students in each city
        Map<String,Long> countMap = studentList.stream().collect(Collectors.groupingBy(Student::getCity,Collectors.counting()));
        System.out.println(countMap);

        // top 3 students
        List<String> top3 = studentList.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).map(n->n.getName()).limit(3).toList();
        System.out.println(top3);

        // check if all students passed
        Boolean res = studentList.stream().allMatch(n->n.getMarks()>45);
        System.out.println(res);
    }
}
