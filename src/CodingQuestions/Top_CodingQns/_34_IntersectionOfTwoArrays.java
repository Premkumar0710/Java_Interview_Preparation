package CodingQuestions.Top_CodingQns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _34_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        /*
        Find intersection of two arrays
        Input: [1,2,2,3], [2,2,4]
        Output: [2,2]
         */

        int input[] = {1,2,2,3};
        int input2[] = {2,2,4};

        Set<Integer> hs = new HashSet<>();
        for(int num : input2){
            hs.add(num);
        }

        List<Integer> al = new ArrayList<>();
        for(int num : input){
            if(hs.contains(num)) al.add(num);
        }

        System.out.println(al);
    }
}
