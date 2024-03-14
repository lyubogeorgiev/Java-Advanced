package L03ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book>{
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

    @Override
    public int compareTo(Book o) {
        if (this.getTitle().compareTo(o.getTitle()) > 0){
            return 1;
        } else if (this.getTitle().compareTo(o.getTitle()) < 0){
            return -1;
        } else {
            if (this.getYear() > o.getYear()){
                return 1;
            } else if (this.getYear() < o.getYear()){
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return this.getTitle() + " - " + this.getYear();
    }
}
