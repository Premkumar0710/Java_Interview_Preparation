package InterviewPrep.UnknownConcepts.MarkerInterface.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableDemo {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))){
            Student s = (Student) ois.readObject();
            s.display();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
