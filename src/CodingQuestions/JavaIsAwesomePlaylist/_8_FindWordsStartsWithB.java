package CodingQuestions.JavaIsAwesomePlaylist;

import java.util.Arrays;
import java.util.List;

public class _8_FindWordsStartsWithB {

    public static void main(String[] args) {
         String s = "Box apple fox amazon buy auto";
         List<String> splilist = Arrays.stream(s.split(" ")).toList();
         List<String> res = splilist.stream().filter(str->str.matches("(?i)^b.*")).toList(); // makes case insensitive
         System.out.println(res);
    }
}
