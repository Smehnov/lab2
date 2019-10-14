package ru.ifmo.smehnov;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.smehnov.pokemons.Deoxys;
import ru.ifmo.smehnov.pokemons.Taillow;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon deoxys = new Deoxys();
        Pokemon taillow = new Taillow();

        b.addAlly(taillow);
        b.addFoe(deoxys);
        b.go();
    }
}
