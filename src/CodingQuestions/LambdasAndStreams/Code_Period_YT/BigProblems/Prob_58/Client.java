package CodingQuestions.LambdasAndStreams.Code_Period_YT.BigProblems.Prob_58;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Prem","CSE",100000),
                new Employee("Ram","CSE",65000),
                new Employee("Som","ECE",450000),
                new Employee("Nom","ECE",50000)
        );

        Map<String,Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalary.forEach((dept,salary)-> System.out.println(dept+ " "+salary));
    }
}
