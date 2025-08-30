package CodingQuestions.Top_30_CodingQns;

import java.util.HashSet;
import java.util.List;

public class _11_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,2,3);
        HashSet<Integer>hs = new HashSet<>();

        for(int i=0;i<list.size();i++){
            hs.add(list.get(i));
        }
        System.out.println(hs);
    }
}
