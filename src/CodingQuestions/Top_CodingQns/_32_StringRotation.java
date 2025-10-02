package CodingQuestions.Top_CodingQns;

public class _32_StringRotation {
    public static boolean areRotations(String s1 , String s2){
        if(s1.length()!=s2.length()) return false;

        String concat = s1+s1;
        if(concat.contains(s2)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(areRotations("abcd","cdab"));
    }
}
