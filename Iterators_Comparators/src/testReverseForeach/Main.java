package testReverseForeach;

public class Main {
    public static void main(String[] args) {
        CustomIterator customIterator = new CustomIterator(1, 2, 3, 4, 5);

        for (Integer i : customIterator) {
            System.out.println(i);
        }
    }
}
