package Ex07Google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Relative> parents;
    private List<Relative> children;
    private List<Pokemon> pokemons;

    public Person(String name){
        this.name = name;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public void addParent(Relative relative){
        this.parents.add(relative);
    }

    public void addChild(Relative relative){
        this.children.add(relative);
    }

    public void setCar(Car car){
        this.car = car;
    }

    public void setCompany(Company company){
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }

    public List<Relative> getParents() {
        return parents;
    }

    public List<Relative> getChildren() {
        return children;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName(){
        return this.name;
    }

    public String getPokemonsAsString(){
        return String.format("%n%s%n",
                this.pokemons.stream().map(String::valueOf).collect(Collectors.joining("%n")));
    }

    public String getParentsAsString(){
        return String.format("%n%s%n",
                this.parents.stream().map(String::valueOf).collect(Collectors.joining("%n")));
    }

    public String getChildrenAsString(){
        return String.format("%n%s%n",
                this.children.stream().map(String::valueOf).collect(Collectors.joining("%n")));
    }
    @Override
    public String toString() {
        return String.format("%s%nCompany:%s%nCar:%s%nPokemon:%sParents:%sChildren:%s",
                this.getName(),
                (this.getCompany() == null ? "" : this.getCompany()),
                this.getCar(),
                this.getPokemonsAsString(),
                this.getParentsAsString(),
                this.getChildrenAsString());
    }
}
