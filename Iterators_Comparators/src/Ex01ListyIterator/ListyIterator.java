package Ex01ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterator<String> {
    private final List<String> collection;
    private int index;

    public ListyIterator(String... collection) {
        this.collection = Arrays.asList(collection);
        this.index = 0;
    }

    public void print() {
        if (this.collection.isEmpty()) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.collection.get(this.index));
        }
    }

    public boolean move(){
        if (this.hasNext()){
            this.index++;
            return true;
        }

        return false;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.collection.size() - 1;
    }

    @Override
    public String next() {
        return this.collection.get(this.index++);
    }
}
