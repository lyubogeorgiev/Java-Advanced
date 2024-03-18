package Ex05ComparingObjects;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;
    private final String town;

    public Person(String name, int age, String town){
        this.name = name;
        this.age = age;
        this.town = town;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) > 0){
            return 1;
        } else if (this.name.compareTo(o.name) < 0) {
            return -1;
        } else {
            if (this.age > o.age) {
                return 1;
            } else if (this.age < o.age){
                return -1;
            } else {
                return this.town.compareTo(o.town);
            }
        }
    }
}
