package org.example;

public class MainTest2 {
    public static void main(String[] args)
    {
        Mage mage1 = new Warlock();
        Mage mage2 = new Sorcerer();

        mage1.setHealth(90);
        mage1.setMana(50);
        mage2.setHealth(120);
        mage2.setMana(40);

        Rogue rogue1 = new Duelist();
        Rogue rogue2 = new Phantom();

        rogue1.setHealth(100);
        rogue1.setAgility(20);
        rogue2.setHealth(100);
        rogue2.setAgility(20);

        System.out.println("Mage1: " + mage1);
        System.out.println("Mage2: " + mage2);
        System.out.println("Rogue1: " + rogue1);
        System.out.println("Rogue2: " + rogue2);

        if (mage1.equals(mage2)) {
            System.out.println("Mage1 и Mage2 эквивалентны.");
        } else {
            System.out.println("Mage1 и Mage2 не эквивалентны.");
        }

        if (rogue1.equals(rogue2)) {
            System.out.println("Rogue1 и Rogue2 эквивалентны.");
        } else {
            System.out.println("Rogue1 и Rogue2 не эквивалентны.");
        }

    }
}