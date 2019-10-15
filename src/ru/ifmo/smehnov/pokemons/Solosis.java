package ru.ifmo.smehnov.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.smehnov.moves.Facade;
import ru.ifmo.smehnov.moves.Rest;

public class Solosis extends Pokemon {
    public Solosis(){
        this("Solosis",1);
    }

    public Solosis(String name, int level){
        super(name, level);
        this.setType(Type.PSYCHIC);
        this.setStats(45, 30, 40, 105, 50, 20);
        this.addMove(new Rest());
        this.addMove(new Facade());
    }
}
