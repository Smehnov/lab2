package ru.ifmo.smehnov.pokemons;

import ru.ifmo.smehnov.moves.Bite;

public class Swellow extends Taillow{
    public Swellow(){
        this("Swellow", 1);

    }

    public Swellow(String name, int level){
        super(name, level);
        this.setStats(60, 85, 60, 75, 50, 125);
        this.addMove(new Bite());
    }
}
