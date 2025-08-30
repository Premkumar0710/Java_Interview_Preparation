package CodingQuestions.Top_30_CodingQns;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _21_FindLeaders {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();

        int maxFromRight = arr[n-1];
        al.add(maxFromRight);

        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxFromRight){
                maxFromRight = arr[i];
                al.add(maxFromRight);
            }
        }
        List <Integer> rev = al.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(rev);
    }
}

/*
 // Brute force
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n-1;i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            if (count == n-i-1) {
                al.add(arr[i]);
            }
        }
        al.add(arr[n-1]);
        System.out.println(al);
 */