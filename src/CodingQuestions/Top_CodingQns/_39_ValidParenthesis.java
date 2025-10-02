package CodingQuestions.Top_CodingQns;

import java.util.Stack;

public class _39_ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        // edge case
        if(s.length()%2==1){
            System.out.println(false);
            return;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                char CH = st.peek();
                if(ch==')' && CH!='(') {
                    System.out.println(false);
                    return;
                }
                if(ch=='}' && CH!='{') {
                    System.out.println(false);
                    return;
                }
                if(ch==']' && CH!='[') {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
