package CodingQuestions.OtherImportantQnsFromYT;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _4_CountSecondFreqWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "banana", "orange", "Apple", "banana", "orange", "Apple", "Apple", "Banana");
        Map<String, Long> map = words.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        // Step 2: sort by frequency (descending), then skip(1) for 2nd most frequent
        Optional<String> ans = map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println("2nd most frequent word = " + ans.orElse("No second word"));
    }
}
