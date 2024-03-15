package testReverseForeach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CustomIterator implements Iterable<Integer> {
    private List<Integer> container;

    public CustomIterator(Integer...numbers){
        this.container = Arrays.asList(numbers);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorClass();
    }

    private class IteratorClass implements Iterator<Integer>{
        int index = container.size() - 1;

        @Override
        public boolean hasNext() {
            return this.index > -1;
        }

        @Override
        public Integer next() {
            return container.get(index--);
        }
    }
}
