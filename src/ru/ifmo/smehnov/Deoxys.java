package ru.ifmo.smehnov;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Deoxys extends Pokemon {

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
