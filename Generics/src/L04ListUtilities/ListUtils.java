package L04ListUtilities;

import java.util.List;

public class ListUtils {
    public static <T extends Comparable<T>> T getMin(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }

        return list.stream().min(Comparable::compareTo).orElse(null);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list){
        if (list.isEmpty()){
            throw new IllegalArgumentException();
        }

        return list.stream().max(Comparable::compareTo).orElse(null);
    }
}
