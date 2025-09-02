package JavaFundamentals.ComparableVsComparator.Comparator;

import java.util.Comparator;

public class Student {
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name : "+ name + " Age : " + age + " marks : " + marks;
    }


}
