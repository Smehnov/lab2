package ru.ifmo.smehnov.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bite extends PhysicalMove {

    public Bite() {
        super(Type.DARK, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3);
        e.flinch(p);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "bite";
    }
}
