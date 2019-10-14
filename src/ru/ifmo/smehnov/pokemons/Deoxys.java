package ru.ifmo.smehnov.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.smehnov.moves.AirSlash;
import ru.ifmo.smehnov.moves.BugBuzz;
import ru.ifmo.smehnov.moves.Rest;
import ru.ifmo.smehnov.moves.WingAttack;

public class Deoxys extends Pokemon {

    public Deoxys(){
        this("Dyoxys", 1);
    }

    public Deoxys(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC);
        super.setStats(50, 150, 50, 150, 50, 150);
        super.addMove(new WingAttack());
        super.addMove(new AirSlash());
        super.addMove(new Rest());
        super.addMove(new BugBuzz());
    }

}
