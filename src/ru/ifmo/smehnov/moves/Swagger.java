package ru.ifmo.smehnov.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK,2);
        p.addEffect(new Effect().condition(Status.PARALYZE));
    }

    @Override
    protected String describe(){
        return "swagger";
    }
}
