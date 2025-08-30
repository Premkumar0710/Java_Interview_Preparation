package CodingQuestions.Top_30_CodingQns;

public class _25_CountVowelsAndConsonants {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
        int vowelCount = 0;
        int consonantCount = 0;
        for(int i=0;i<str.length();i++) {
            char ch = sb.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vowelCount++; }
            else { consonantCount++; }
        }

        System.out.println("vowelCount : " + vowelCount + " | consonantCount : " + consonantCount);
    }
}
