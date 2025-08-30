package CodingQuestions.JavaIsAwesomePlaylist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _2_SortMapBasedOnValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple",10);
        map.put("Orange",20);
        map.put("Cherry",30);
        map.put("Banana",40);
        map.put("Mango",5);

       List<String> asc =  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(n->n.getKey()).collect(Collectors.toList());
       List<String> desc =  map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).map(n->n.getKey()).collect(Collectors.toList());

        System.out.println(asc);
        System.out.println(desc);
    }
}
