package JavaFundamentals.ComparableVsComparator.Comparable;

public class Student implements Comparable<Student>{
    String name;
    int age;
    int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks; // marks on asc
        // return other.marks - this.marks; // marks on desc
    }

    @Override
    public String toString() {
        return "Name : "+ name + ", marks : "+marks;
    }

}
