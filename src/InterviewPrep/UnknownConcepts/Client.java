package InterviewPrep.UnknownConcepts;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Client {

    public static void main(String[] args) {

        // Arrays.asLiost & List.of

        List<Object> arraysAsList = Arrays.asList(1,2,3,4,"Prem");
        arraysAsList.set(0,"Kumar");
      //  arraysAsList.add(2); can't modify the size
        System.out.println(arraysAsList);

        List<Object> listOf = List.of("Hi",1,2,"Kumar");
      //  listOf.set(1,"all"); doesnt support
        System.out.println(listOf);

        // Hashmap & Hashtable

        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(null,1);
        System.out.println(map);

        Hashtable<Integer,Integer> table = new Hashtable<>();
       // table.put(null,1); Hashtable doesn't allow the key to be null
        table.put(2,1);
        System.out.println(table);

        Map<Integer,Integer> conMap = new ConcurrentHashMap<>();
       // conMap.put(null,1);  doesn't allow the key to be null
        conMap.put(100,1);
        System.out.println(conMap);

        // Stream API Question
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        Double average = nums.stream().filter(n->n>3).mapToDouble(n->n).average().getAsDouble();
        System.out.println("Variant 1 : " + average);
        Long count = nums.stream().filter(n->n>3).count();
        Double average1 = nums.stream().filter(n->n>3).mapToDouble(n->n).reduce(0.0,(a,b)->a+b)/count;
        System.out.println("Variant 2 : " + average1);

        // char & String concatenation
        char ch = 'c' , ch1 = 'd';
        System.out.println(ch);
        System.out.println(ch+ch1);
        System.out.println(ch1+ch+"aler");
        System.out.println("Hi"+ch+ch1);
        // convert char to String
        char c = 'A' ;
        char c1 = 'B';
        String s = String.valueOf(c);
        String s1 = String.valueOf(c1);
        System.out.println(s+s1);
        System.out.println("Hi"+s+s1);
        System.out.println(s1+s+"Hi");

        // toString()
        dummyClass d = new dummyClass();
        System.out.println(d.toString()); // prints classname@hashcode




    }
}
