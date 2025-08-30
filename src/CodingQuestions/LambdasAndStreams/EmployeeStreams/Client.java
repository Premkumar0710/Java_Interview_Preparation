package CodingQuestions.LambdasAndStreams.EmployeeStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(1, "Prem", 25, 100000));
//        employees.add(new Employee(2, "Kumar", 28, 120000));
//        employees.add(new Employee(3, "Raj", 30, 110000));

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Prem",25,100000),
                new Employee(2, "Kumar", 28, 120000),
                new Employee(3, "Raj", 30, 110000)
        );

        // 1. 🔢 Sort employees by ID in ascending order
        List<Employee> ans = employees.stream().sorted(Comparator.comparing(Employee::getId)).toList();
        System.out.println(ans);

        // 2. 🔽 Sort employees by salary in descending order
        List<Employee> ans1 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(ans1);

        // 3. 🎂 Sort employees by age, then by name
        List<Employee> ans2 = employees.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)).toList();
        System.out.println(ans2);

       // 4. 📏 Get top 3 highest paid employees

        List<Employee> top3Salaries = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

      //  5. 🔍 Filter employees older than 30 and sort by name
        List<Employee> filteredSorted = employees.stream()
                .filter(e -> e.getAge() > 30)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

       // 6. 🎯 Find the employee with the minimum salary

        Optional<Employee> minSalaryEmp = employees.stream()
                .min(Comparator.comparing(Employee::getSalary));

      //  7. 🏆 Find the employee with the maximum age
             Optional<Employee> oldestEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getAge));

       // 8. 🔠 Sort by name alphabetically ignoring case
               List<Employee> sortedByName = employees.stream()
                .sorted(Comparator.comparing(e -> e.getName().toLowerCase()))
                .collect(Collectors.toList());

       // 9. 🎙️ Group employees by age

        Map<Integer, List<Employee>> groupedByAge = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

       // 10. 🎯 Find employee(s) with second-highest salary

        List<Double> distinctSalariesDesc = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        double secondHighestSalary = distinctSalariesDesc.get(1);

        List<Employee> secondHighestEmp = employees.stream()
                .filter(e -> e.getSalary() == secondHighestSalary)
                .collect(Collectors.toList());


    }
}
