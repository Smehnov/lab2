package ru.ifmo.smehnov;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AirSlash extends PhysicalMove {
    public AirSlash() {
        super(Type.FLYING, 75, 95);
    }

    @Override
    protected String describe(){
        return "air slash";
    }
}