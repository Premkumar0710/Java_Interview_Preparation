package CodingQuestions.Strings15Qns;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Qns_1to8 {
    public static void main(String[] args) {
        // 1. Convert string to int
        String str = "123";
        int str1 = Integer.parseInt(str);
        System.out.println("Question:1 " + str1);
        // Convert int to string
        int nums = 123;
        String nums1 = String.valueOf(nums);
        System.out.println("Question:1 " + nums1);

        // 2. extract only number from String
        String input = "String123$";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch>=49 && ch<=57){
                sb.append(ch);
            }
        }
        System.out.println("Question:2 " + sb.toString());

        // 4. Print Only Unique Characters from a String
        String Input4 =  "AABBCCDDE";
        String res = Arrays.stream(Input4.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(n->n.getValue()==1).map(n->n.getKey()).collect(Collectors.joining());
        System.out.println("Question:4 " + res);

        // 5. Find Occurrence of Each Character in a String
        String Input5 = "Automation";
        Map<String,Long> map = Arrays.stream(Input5.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Question:5 " + map);

        // 6. Count Occurrence of Vowels in a String
        String Input6 = "Selenium Automation Testing";

        Map<String, Long> map1 = Arrays.stream(Input6.split(""))
                .filter(s -> s.matches("[aeiouAEIOU]")) // keep only vowels
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Question:6 " + map1);

        // 7. Count Number of Words in a String
        String Input7 = "Selenium Automation Testing";
        List<String> split = Arrays.stream(Input7.split(" ")).toList();
        System.out.println("Question:7 - method 1 : " + split.size());
        int ans = Input7.split(" ").length;
        System.out.println("Question:7 - method 2 : " + ans);

        // 8. Merge Two Strings Without Duplicates (check)
        String Input8 = "I Love Java I Love Python" ;
        List<String> al = Arrays.stream(Input8.split(" ")).toList();
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<Input8.length();i++){
            hs.add(al.get(i));
        }
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}
