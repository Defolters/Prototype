package com.company;

public class Bacteria extends Creature {


    public Bacteria() {
        super.creatureType = CreatureType.BACTERIA;
        super.dna = "CAGTCATCGTACGATGGCTAG";
        super.health = 10;
        super.maxHealth = 10;
        super.power = 10;
    }

    public Bacteria(Bacteria bacteria) {
        super(bacteria);
    }

    @Override
    public Creature clone() {
        return new Bacteria(this);
    }
}
