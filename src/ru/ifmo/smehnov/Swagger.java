package ru.ifmo.smehnov;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends PhysicalMove {
    public Swagger(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected String describe(){
        return "swagger";
    }
}
