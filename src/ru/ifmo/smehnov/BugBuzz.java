package ru.ifmo.smehnov;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class BugBuzz extends SpecialMove {
    public BugBuzz(){
        super(Type.FLYING,60,100);
    }

    @Override
    protected String describe(){
        return "bug buzz";
    }

}
