package ru.ifmo.smehnov.pokemons;

import ru.ifmo.smehnov.moves.AerialAce;

public class Reuniclus extends Duosion {
    public Reuniclus() {
        this("Reuniclus", 1);
    }

    public Reuniclus(String name, int level) {
        super(name, level);
        this.setStats(110, 65, 75, 125, 85, 30);
        this.addMove(new AerialAce());
    }


}
