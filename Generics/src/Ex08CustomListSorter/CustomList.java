package Ex08CustomListSorter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomList<T extends Comparable<T>> {
    private T[] container;
    private int size;
    private Class<T> clazz;

    public CustomList(Class<T> clazz){
        this.container = (T[]) Array.newInstance(clazz, 2);
        this.clazz = clazz;
    }

    public void add(T element){
        if (this.size == this.container.length){
            this.resizeUp();
        }

        this.size++;
        this.container[size - 1] = element;
    }

    public T remove(int index){
        T removedElement = this.container[index];

        this.size--;

        for (int i = index; i < this.size; i++) {
            this.container[i] = this.container[i + 1];
        }

        return removedElement;
    }

    private void resizeUp(){

        T[] oldArray = this.container;

        this.container = Arrays.copyOf(oldArray, oldArray.length * 2);
    }

    public int getSize(){
        return this.size;
    }

    public int getContainerSize(){
        return this.container.length;
    }

    public T getElement(int index){
        return this.container[index];
    }

    public boolean contains(T element){

        for (int i = 0; i < this.getSize(); i++) {
            if (this.container[i].equals(element)){
                return true;
            }
        }

        return false;
    }

    public void swap(int first, int second){
        T temp = this.container[first];
        this.container[first] = this.container[second];
        this.container[second] = temp;
    }

    public int countGreaterThan(T element){
        int counter = 0;

        for (int i = 0; i < this.getSize(); i++) {
            if (this.container[i].compareTo(element) > 0){
                counter++;
            }
        }

        return counter;
    }

    public T getMax(){
        return Arrays.stream(Arrays.copyOfRange(this.container, 0, this.getSize()))
                .max(Comparable::compareTo).orElse(null);
    }

    public T getMin(){
        return Arrays.stream(Arrays.copyOfRange(this.container, 0, this.getSize()))
                .min(Comparable::compareTo).orElse(null);
    }
}
