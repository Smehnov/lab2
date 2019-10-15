package ru.ifmo.smehnov.moves;

import ru.ifmo.se.pokemon.*;

public class AirSlash extends SpecialMove {
    public AirSlash() {
        super(Type.FLYING, 75, 95);
    }

    @Override
    protected String describe(){
        return "air slash";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e =new Effect().chance(0.3);
        e.flinch(p);
        p.addEffect(e);
    }
}