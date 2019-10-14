package ru.ifmo.smehnov.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.smehnov.moves.Facade;
import ru.ifmo.smehnov.moves.IceBeam;
import ru.ifmo.smehnov.moves.Swagger;

public class Taillow extends Pokemon {

    public Taillow() {
        this("Taillow", 1);

    }

    public Taillow(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL, Type.FLYING);
        super.setStats(40, 55, 30, 30, 30, 85);
        super.addMove(new Swagger());
        super.addMove(new Facade());
        super.addMove(new IceBeam());

    }
}
