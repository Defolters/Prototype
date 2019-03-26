package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int STEPS = 500;

        ArrayList<Creature> creatures = new ArrayList<>();

        // Сначала была бактерия
        Bacteria bacteria = new Bacteria();
        creatures.add(bacteria);

        // Затем появилась еще одна бактерия
        BestBacteria bestBacteria = new BestBacteria();
        creatures.add(bestBacteria);

        // И они начали жить
        for (int i =0; i<STEPS; i++){
            System.out.println("STEP: " + i +" SIZE: " + creatures.size());
            ArrayList<Creature> newCreatures = new ArrayList<>();

            Iterator iterator = creatures.iterator();
            while (iterator.hasNext()) {
                Creature current = (Creature) iterator.next();

                int random = (int)(Math.random() * 10 + 1);
                if (random > 6) {
                    newCreatures.add(current.clone());
                }

                random = (int)(Math.random() *10+1);
                if (random>4) {
                    current.health--;
                }

                if (current.health == 0) {
                    iterator.remove();
                }
            }
            creatures.addAll(newCreatures);
        }
    }
}
