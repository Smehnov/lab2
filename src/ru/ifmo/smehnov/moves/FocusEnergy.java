package ru.ifmo.smehnov.moves;

import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends StatusMove {
    public FocusEnergy() {
        super(Type.NORMAL, 0, 100);
    }


    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 2d;
    }

    @Override
    protected String describe() {
        return "focus energy";
    }

}
