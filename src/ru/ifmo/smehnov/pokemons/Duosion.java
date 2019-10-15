package ru.ifmo.smehnov.pokemons;

public class Duosion extends Solosis {

    public Duosion(){
        this("Duosion", 1);
    }

    public Duosion(String name, int level){
        super(name, level);
        this.setStats(65, 40, 50, 125, 60, 30);

    }
}
