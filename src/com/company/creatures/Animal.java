package com.company.creatures;

import com.company.devices.Saleable;

import java.io.File;

public abstract class Animal implements Saleable, Feedable {

    final static Double MIN_WEIGHT = 2.0;

    final public String species;
    public Boolean isAlive = true;
    public String name;
    File pic;
    private Double weight = 10.0;

    public Animal(String species) {
        this.species = species;
    }

    public void feed(Double foodWeight) {
        if (this.isAlive) {
            this.weight += foodWeight;
            System.out.println("thx for food");
        } else {
            System.out.println("too late");
        }
    }

    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight--;
            System.out.println("thx for a walk, bro");
            if (this.weight < MIN_WEIGHT) {
                this.isAlive = false;
            }
        } else {
            System.out.println("go for jail");
            System.out.println("nice");
        }
    }

    public Double getWeight() {
        return weight;
    }

    void setWeight(Double newWeight) {
        this.weight = newWeight;
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {

    }
}
