package ru.ifmo.smehnov.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.smehnov.moves.AirSlash;
import ru.ifmo.smehnov.moves.BugBuzz;
import ru.ifmo.smehnov.moves.Rest;
import ru.ifmo.smehnov.moves.WingAttack;

public class Deoxys extends Pokemon {

    public Deoxys() {
        this("Dyoxys", 1);
    }

    public Deoxys(String name, int level) {
        super(name, level);
        this.setType(Type.PSYCHIC);
        this.setStats(50, 150, 50, 150, 50, 150);
        this.addMove(new WingAttack());
        this.addMove(new AirSlash());
        this.addMove(new Rest());
        this.addMove(new BugBuzz());
    }

}
