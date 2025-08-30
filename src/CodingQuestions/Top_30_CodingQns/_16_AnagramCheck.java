package CodingQuestions.Top_30_CodingQns;

import java.util.HashMap;

public class _16_AnagramCheck {

public static boolean anagramCheck(String s1, String s2){
    HashMap<Character,Integer> map = new HashMap<>();

    if(s1.length()!=s2.length()) {
        return false;
    }
    for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        if(!map.containsKey(ch)){
            map.put(ch,1);
        }
        else{
            int temp = map.get(ch);
            map.put(ch,++temp);
        }
    }

    for(Character key : map.keySet()){
        if(s2.contains(key.toString())){
            int value = map.get(key);
            map.put(key,value-1);
        }
    }

    for(Character key : map.keySet()){
        int value = map.get(key);
        if(value>0){
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        String s1 = "listen", s2= "silent";
        boolean ans = anagramCheck(s1,s2);
        System.out.println(ans);
    }
}
