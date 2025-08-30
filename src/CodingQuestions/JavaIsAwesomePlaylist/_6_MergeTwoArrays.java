package CodingQuestions.JavaIsAwesomePlaylist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _6_MergeTwoArrays {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1,2,3);
        List<Integer> arr2 = Arrays.asList(4,5,6);

        List<Integer> mergedArray = Stream.concat(arr1.stream(),arr2.stream()).toList();
        System.out.println(mergedArray);


    }
}
