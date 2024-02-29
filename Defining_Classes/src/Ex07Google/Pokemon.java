package Ex07Google;

public class Pokemon {
    private final String name;
    private final String type;

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    @Override
    public String toString() {
        return String.format("%s %s",
                this.name,
                this.type);
    }
}
