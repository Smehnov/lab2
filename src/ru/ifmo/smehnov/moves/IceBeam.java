package ru.ifmo.smehnov.moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.addEffect(new Effect().condition(Status.FREEZE).chance(0.1));
    }

    @Override
    protected String describe(){
        return "ice beam";
    }
}
