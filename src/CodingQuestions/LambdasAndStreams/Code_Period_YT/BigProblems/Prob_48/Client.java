package CodingQuestions.LambdasAndStreams.Code_Period_YT.BigProblems.Prob_48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<List<String>> names = Arrays.asList(
                List.of("Mike","Antony"),
                List.of("Maher","Lang")
        );

        List<String> flatmap = names.stream().flatMap(Collection::stream).toList();
        System.out.println(flatmap);
    }
}
