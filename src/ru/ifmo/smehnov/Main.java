package ru.ifmo.smehnov;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.smehnov.pokemons.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon deoxys = new Deoxys();
        Pokemon taillow = new Taillow();
        Pokemon swellow = new Swellow();
        Pokemon solosis = new Solosis();
        Pokemon duosion = new Duosion();
        Pokemon reuniclus = new Reuniclus();

        b.addAlly(taillow);
        b.addAlly(swellow);
        b.addAlly(duosion);
        b.addFoe(deoxys);
        b.addFoe(solosis);
        b.addFoe(reuniclus);
        b.go();
    }
}
