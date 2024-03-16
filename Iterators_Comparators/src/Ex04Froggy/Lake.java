package Ex04Froggy;

import java.util.Iterator;

public class Lake implements Iterable<Integer>{
    private Integer[] container;

    public Lake(Integer...container){
        this.container = container;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer>{
        int index = 0;
        @Override
        public boolean hasNext() {
            if (this.index % 2 == 0 || this.index < container.length){
                return true;
            }

            return false;
        }

        @Override
        public Integer next() {
            Integer current = container[this.index];

            if (this.index % 2 == 0){
                if (this.index + 2 >= container.length){
                    this.index = 1;
                } else {
                    this.index += 2;
                }
            }else{
                this.index += 2;
            }
            return current;
        }
    }
}
