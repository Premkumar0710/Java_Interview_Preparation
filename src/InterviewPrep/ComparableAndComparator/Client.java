package InterviewPrep.ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Book> book = Arrays.asList(
                new Book("Harry potter", 600),
                new Book("Space x", 400)
                );

        Collections.sort(book);

        for(Book b : book){
            System.out.println(b);
        }

       // Collections.sort(book, new ComparatorBook());

    }
}
