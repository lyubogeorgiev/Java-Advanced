package Ex06StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().length() > o2.getName().length()) {
            return 1;
        } else if (o1.getName().length() < o2.getName().length()) {
            return -1;
        } else {
            if (o1.getName().toLowerCase().charAt(0) > o2.getName().toLowerCase().charAt(0)) {
                return 1;
            } else if (o1.getName().toLowerCase().charAt(0) < o2.getName().toLowerCase().charAt(0)) {
                return -1;
            }
        }

        return 0;
    }
}
