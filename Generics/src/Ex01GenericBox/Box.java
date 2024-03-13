package Ex01GenericBox;

public class Box<T> {
    T value;

    public Box(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.getClass().getName() + ": " + this.value;
    }
}
