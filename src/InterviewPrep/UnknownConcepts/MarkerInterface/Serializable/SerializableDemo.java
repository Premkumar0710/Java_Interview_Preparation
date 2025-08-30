package InterviewPrep.UnknownConcepts.MarkerInterface.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
    public static void main(String[] args) {
        Student s = new Student("Prem",1);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))){
            oos.writeObject(s);
            System.out.println("Serialisation done .. !!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }



}
