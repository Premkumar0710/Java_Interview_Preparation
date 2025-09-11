package CodingQuestions.Strings15Qns;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Qns_9to15 {

    public static void main(String[] args) {
//      9. Check Whether Two Strings Are Anagrams (optimal approach)
        String Input9a = "race";
        String Input9b = "care";
        int arr[] = new int[26];
        for (int i = 0; i < Input9a.length(); i++) {
            int ch = Input9a.charAt(i) - 'a';
            arr[ch]++;
        }
        for (int i = 0; i < Input9b.length(); i++) {
            int ch = Input9b.charAt(i) - 'a';
            arr[ch]--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.println("Question : 9 " + false);
            }
        }
        System.out.println("Question : 9 " + true);

        // 10. Reverse Each Word in a String
        String Input11 = "I Love Java";
        List<String> res11 = Arrays.stream(Input11.split(" ")).toList();
        List<String> ans11 = new ArrayList<>();
        for (int i = 0; i < res11.size(); i++) {
            String word = res11.get(i);
            String ans = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                ans += word.charAt(j);
            }
            ans11.add(ans);
        }
        System.out.println("Question 10 : " + ans11);

        // 11. Expand Encoded String
        String Input12 = "R2A3J4"; // Expected: RRAAAJJJJ
        StringBuilder res12 = new StringBuilder();

        char currentChar = ' ';

        for (int i = 0; i < Input12.length(); i++) {
            char ch = Input12.charAt(i);

            if (Character.isLetter(ch)) {
                currentChar = ch;
                res12.append(ch); // append once
            } else if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                // already added 1 above, so add (count-1) more
                for (int j = 1; j < count; j++) {
                    res12.append(currentChar);
                }
            }
        }

        System.out.println("Question 11 : " + res12.toString()); // RRAAAJJJJ


        /* Alternate solution
         String Input12 = "R2A3J4";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Input12.length();i++){
            char ch = Input12.charAt(i);
            if(ch>='A' && ch<='Z'){
                sb.append(ch);
            }
            else{
                char ch1 = Input12.charAt(i-1);
                int num = Character.getNumericValue(ch);
                for(int j=1;j<num;j++){
                    sb.append(ch1);
                }
            }
        }
       System.out.print(sb.toString());
         */


        // 12 Compress String with Character Counts
        String Input1 = "AAABBBCCDDDD";
        Map<String, Long> map = Arrays.stream(Input1.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        int keyLength = map.size();
        System.out.print("Question 12 : ");
        for(String key : map.keySet()){
            System.out.print(key+map.get(key));
        }

        // 13. Print First Non-Repetitive Character (check)
        String Input13 = "ramireddy";
        Map<String, Long> map13 = Arrays.stream(Input13.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        String ans13 = map13.entrySet().stream().filter(n->n.getValue()==1).map(n->n.getKey()).findFirst().orElse("none");
        System.out.println(ans13);

        // 14. Find Occurrence of Each Word in a String
        String Input14 = "I Love Java I Love";
        Map<String,Long> map14 = Arrays.stream(Input14.split(" ")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println("Question 14 : " + map14);

        // 15. Java String Interview Questions
        // Input: "Tomorrow"
        // Expected Output: T3m3223w

    }
}
