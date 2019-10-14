package ru.ifmo.smehnov;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WingAttack extends PhysicalMove {
    public WingAttack() {
        super(Type.FLYING, 60, 100);
    }

    public WingAttack(Type attackType, double pow, double acc) {
        super(attackType, pow, acc);
    }

    @Override
    protected String describe(){
        return "wing attack";
    }
}
