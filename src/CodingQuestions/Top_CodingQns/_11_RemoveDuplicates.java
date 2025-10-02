package CodingQuestions.Top_CodingQns;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _11_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,1,2,2,3);
        Set<Integer> hs = new LinkedHashSet<>();

        for(int i=0;i<list.size();i++){
            hs.add(list.get(i));
        }
        System.out.println(hs);
    }
}
