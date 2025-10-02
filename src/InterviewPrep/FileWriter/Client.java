package InterviewPrep.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {

        String data = "This is the data that I'm gonna write & read";

        // Writing to file (auto-close with try-with-resources)
        try (FileWriter fileWriter = new FileWriter("Output.txt")) {
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from file
        try (BufferedReader br = new BufferedReader(new FileReader("Output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}