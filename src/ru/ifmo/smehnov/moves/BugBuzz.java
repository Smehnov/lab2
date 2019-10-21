package ru.ifmo.smehnov.moves;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -1).chance(0.1));
    }

    @Override
    protected String describe() {
        return "bug buzz";
    }

}
