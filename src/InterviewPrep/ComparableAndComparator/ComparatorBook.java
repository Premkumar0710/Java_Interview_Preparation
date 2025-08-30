package InterviewPrep.ComparableAndComparator;

import java.util.Comparator;



public class ComparatorBook implements Comparator <Book>{

    String title;
    int pages;


    public ComparatorBook(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }

    @Override
    public String toString() {
        return "ComparatorBook{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
