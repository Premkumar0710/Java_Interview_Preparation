package InterviewPrep.UnknownConcepts.MarkerInterface.Serializable;

import java.io.Serializable;

public class Student implements Serializable {

    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void display(){
        System.out.println("Student id : " + id + "Name : " + name);
    }




}
