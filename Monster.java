package com.company;

import com.sun.org.apache.xpath.internal.operations.String;

public class Monster {
    private final java.lang.String name;
    private int health = 500;
    private int attack = 50;
    private boolean alive = true;

    public void getMonsterStats() {
        System.out.println("Name: " + getName());
        System.out.println("Health: " + Integer.toString(getHealth()));
        System.out.println("Attack: " + Integer.toString(getAttack()));
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public java.lang.String getName() {
        return name;
    }

    public boolean mosterIsAlive() {
        return alive;
    }

    public void isAlive() {
        if (alive) {
            System.out.println(getName() + " has " + Integer.toString(getHealth()) + " left.");
        } else {
            System.out.println(getName() + " was taken down.");
        }
    }

    public void setHealth(int newHealth) {
        health = newHealth;
    }

    public void setAttack(int newAttack) {
        attack = newAttack;
    }

    public void decreaseHealth(int decHealt) {
        health -= decHealt;
        if (health <= 0) {
            alive = false;
        }
    }

    public void increaseHealth(int incHealth) {
        health += incHealth;
    }

    public Monster(int health, int attack, java.lang.String name) {
        this.health = health;
        this.attack = attack;
        this.name = name;
    }
}
