package CodingQuestions.Top_30_CodingQns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _7_FindDuplicateElements {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        List<Integer> list =Arrays.asList(1,2,3,1,5);
        for(int i=0;i<list.size();i++){
            if(hs.contains(list.get(i))) {
                System.out.println(list.get(i));
                break;
            }
            else {hs.add(list.get(i));};
        }
    }
}
