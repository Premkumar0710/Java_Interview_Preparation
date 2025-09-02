package JavaFundamentals.ComparableVsComparator.Comparator;

import JavaFundamentals.ComparableVsComparator.Comparator.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Prem",25,99),
                new Student("Ram",26,98),
                new Student("Som",27,97)
        );

        // sort in asc by name
        Collections.sort(students,new NameComparator());
        System.out.println(students);

        // sort in desc by age
        Collections.sort(students,new AgeComparator());
        System.out.println(students);

        // sort in desc by mark
        Collections.sort(students,new MarkComparator());
        System.out.println(students);

    }
}
