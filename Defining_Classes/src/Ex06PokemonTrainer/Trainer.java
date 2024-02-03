package Ex06PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name){
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public List<Pokemon> getPokemons(){
        return this.pokemons;
    }

    public void addBadge(){
        this.numberOfBadges++;
    }

    public void setPokemons(List<Pokemon> pokemons){
        this.pokemons = pokemons;
    }

    public int getNumberOfBadges(){
        return this.numberOfBadges;
    }
}
