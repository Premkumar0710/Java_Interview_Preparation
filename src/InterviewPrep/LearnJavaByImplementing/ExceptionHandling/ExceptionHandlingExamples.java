package InterviewPrep.LearnJavaByImplementing.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExceptionHandlingExamples {

    public static void main(String[] args) {

        // checked
        try{
            FileReader fr = new FileReader("sample.txt");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        // unchecked
        try{
            int res = 8/0;
        }
        catch (RuntimeException e){
            System.out.println("You cannot divide the number by 0");
        }

        List<Integer> nums = Arrays.asList(1,2,3,4,5);


    }
}
