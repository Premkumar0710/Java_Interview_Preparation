package CodingQuestions.Strings15Qns;

public class OtherQns {
    public static void main(String[] args) {
        // convert to camel case
        String input = "hello wORld jAva";
        String[] str = input.split(" ");

        for (int i = 0; i < str.length; i++) {
            // lowercase whole word first
            str[i] = str[i].toLowerCase();

            // make first letter uppercase (except for the very first word if you want true camelCase)
            if (i > 0) {
                str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
            }
        }

        // join the words
        StringBuilder sb = new StringBuilder();
        for (String word : str) {
            sb.append(word);
        }

        System.out.println(sb.toString()); // Output: helloWorldJava
    }
}
