package CodingQuestions.LambdasAndStreams.Code_Period_YT.BigProblems.Prob_57;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        // find the dept which has more number of students

        List<Employee> employeeList = Arrays.asList(
                new Employee("Prem","CSE"),
                new Employee("Ram","ECE"),
                new Employee("Som","IT"),
                new Employee("Veen","EEE"),
                new Employee("Kumar","CSE")
        );

        Map<String,Long> maxStudents = employeeList.stream().map(n->n.getDepartment()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        String maxDept = maxStudents.entrySet().stream()
                .max(Map.Entry.comparingByValue())   // compare by count
                .map(Map.Entry::getKey)              // get department name
                .orElse("No Department");
        System.out.println(maxDept);


    }
}
