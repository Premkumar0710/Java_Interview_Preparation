package CodingQuestions.OtherImportantQnsFromYT._1_ListToMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _1_ListToMap {
    public static void main(String[] args) {

        List<User> userList = Arrays.asList(
                new User("Prem","123"),
                new User("Kumar","456")
        );

        Map<String,String> map = userList.stream().collect(Collectors.toMap(User::getName,User::getPassword,
                (existing,duplicate)->existing)); // this merge function is essential if there is any duplicate in the map
        System.out.println(map);
    }
}
