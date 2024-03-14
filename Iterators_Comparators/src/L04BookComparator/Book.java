package L04BookComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String...authors){
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setAuthors(String...authors){
        this.authors = Arrays.asList(authors);
    }

    public String getTitle(){
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

    public List<String> getAuthors(){
        return Collections.unmodifiableList(this.authors);
    }
}
