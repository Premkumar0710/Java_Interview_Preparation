package JavaFundamentals.ComparableVsComparator.Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Student> studentsList = Arrays.asList(
                new Student("Prem",25,99),
                new Student("Ram",26,98),
                new Student("Som",27,97)
        );

        Collections.sort(studentsList); // uses compareTo
        System.out.println(studentsList);

    }
}
