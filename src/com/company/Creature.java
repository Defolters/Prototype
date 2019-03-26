package com.company;

public abstract class Creature {

    enum CreatureType { BACTERIA, BEST_BACTERIA, DEFAULT }

    public int power;
    public int health;
    public int maxHealth;
    public String dna;
    public CreatureType creatureType = CreatureType.DEFAULT;

    public Creature() {}

    public Creature(Creature creature) {
        if (creature != null) {
            power = creature.power;
            health = creature.health;
            dna = creature.dna;
            creatureType = creature.creatureType;
            maxHealth = creature.maxHealth;
        }
    }

    public abstract Creature clone();
}
