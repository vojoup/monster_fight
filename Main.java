package com.company;

import java.util.Scanner;

public class Main {

    public static void printWinner(Monster m1, Monster m2) {
        if (m1.mosterIsAlive()) {
            System.out.println(m1.getName() + " defeated " + m2.getName());
        } else if (m2.mosterIsAlive()) {
            System.out.println(m2.getName() + " defeated " + m1.getName());
        } else if (!m1.mosterIsAlive() && !m2.mosterIsAlive()) {
            System.out.println("Both " + m1.getName() + " and " + m2.getName() + " were defeated.");
        }
    }

    public static void fight(Monster m1, Monster m2) {
        m1.decreaseHealth(m2.getAttack());
        m2.decreaseHealth(m1.getAttack());
        m1.isAlive();
        m2.isAlive();
    }

    public static void main(String[] args) {
	    System.out.println("Start.");

        Scanner reader = new Scanner(System.in);
        // User input for m1
        System.out.println("Enter a name for the first monster:");
        String m1Name = reader.nextLine();
        System.out.println("Enter health amount for the first monster:");
        int m1Health = reader.nextInt();
        System.out.println("Enter attack for the first monster:");
        int m1Attack = reader.nextInt();
        reader.nextLine();
        // User input for m2
        System.out.println("Enter a name for the second monster:");
        String m2Name = reader.nextLine();
        System.out.println("Enter health amount for the second monster:");
        int m2Health = reader.nextInt();
        System.out.println("Enter attack for the second monster:");
        int m2Attack = reader.nextInt();

	    Monster m1 = new Monster(m1Health, m1Attack, m1Name);
        Monster m2 = new Monster(m2Health, m2Attack, m2Name);
        m1.getMonsterStats();
        m2.getMonsterStats();
        while (m1.mosterIsAlive() && m2.mosterIsAlive()) {
            fight(m2, m1);
        }

        printWinner(m1, m2);
    }
}
