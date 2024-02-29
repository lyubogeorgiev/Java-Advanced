package Ex07Google;

public class Relative {
    private final String name;
    private final String birthday;

    public Relative(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public String getName(){
        return this.name;
    }

    public String getBirthday(){
        return this.birthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",
                this.name,
                this.birthday);
    }
}
