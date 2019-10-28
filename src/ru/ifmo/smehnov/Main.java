package ru.ifmo.smehnov;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.smehnov.pokemons.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        b.addAlly(new Taillow());
        b.addAlly(new Swellow());
        b.addAlly(new Duosion());
        b.addFoe(new Deoxys());
        b.addFoe(new Solosis());
        b.addFoe(new Reuniclus());

        b.go();
    }
}
