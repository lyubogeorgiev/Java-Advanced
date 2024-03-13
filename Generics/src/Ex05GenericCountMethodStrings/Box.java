package Ex05GenericCountMethodStrings;

public class Box<T extends Comparable<T>> implements Comparable<T> {
    T value;

    public Box(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.getClass().getName() + ": " + this.value;
    }

    @Override
    public int compareTo(T o) {
        return this.value.compareTo(o);
    }
}
