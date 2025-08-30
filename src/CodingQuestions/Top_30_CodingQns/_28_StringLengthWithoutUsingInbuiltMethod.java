package CodingQuestions.Top_30_CodingQns;

public class _28_StringLengthWithoutUsingInbuiltMethod {
    public static void main(String[] args) {
        String sentence = "Automation";
        int length = 0;
        try{
            while(true){
                char ch = sentence.charAt(length);
                length++;
            }
        }
        catch (RuntimeException e){
            System.out.println("Index out of bound should be handled here to find the length of the string");
        }

        System.out.println(length);

    }
}
