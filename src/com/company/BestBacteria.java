package com.company;

public class BestBacteria extends Creature {

    public BestBacteria() {
        super.creatureType = CreatureType.BEST_BACTERIA;
        super.dna = "TAGGGCATCGATCGATCGATCG";
        super.health = 7;
        super.maxHealth = 7;
        super.power = 10;
    }

    public BestBacteria(BestBacteria bestBacteria) {
        super(bestBacteria);
    }

    @Override
    public Creature clone() {
        return new BestBacteria(this);
    }
}
