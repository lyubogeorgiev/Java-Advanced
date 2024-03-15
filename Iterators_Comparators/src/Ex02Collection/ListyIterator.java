package Ex02Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
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

    public boolean hasNext() {
        return this.index < this.collection.size() - 1;
    }

    public String next() {
        if (this.hasNext()){
            return this.collection.get(this.index);
        }
        return this.collection.get(this.index++);
    }

    public void printAll(){
        for (String s : this) {
            System.out.print(s + " ");
        }

        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<String>{

        private int index_iterator = 0;
        @Override
        public boolean hasNext() {
            return this.index_iterator < collection.size();
        }

        @Override
        public String next() {
            return collection.get(this.index_iterator++);
        }
    }
}
