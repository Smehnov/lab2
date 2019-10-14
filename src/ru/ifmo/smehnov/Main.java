package ru.ifmo.smehnov;
import ru.ifmo.se.pokemon.*;
public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
        Pokemon deoxys = new Deoxys("Deoxys",10);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addFoe(deoxys);
        b.go();
    }
}
