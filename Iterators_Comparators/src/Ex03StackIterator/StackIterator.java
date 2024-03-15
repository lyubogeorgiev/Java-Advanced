package Ex03StackIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StackIterator implements Iterable<Integer> {
    private List<Integer> container;

    public StackIterator() {
        this.container = new ArrayList<>();
    }

    public void pop() {
        if (this.container.isEmpty()) {
            System.out.println("No elements");
        } else {
            this.container.remove(this.container.size() - 1);
        }
    }

    public void push(Integer... elements){
        this.container.addAll(Arrays.asList(elements));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new InsideIterator();
    }

    private class InsideIterator implements Iterator<Integer> {

        private int index = container.size() - 1;

        @Override
        public boolean hasNext() {
            return this.index > 0;
        }

        @Override
        public Integer next() {
            return container.get(this.index--);
        }
    }
}
