package org.example;

public class MainTest4 {
    public static void main(String[] args) {
        Mage mage = new Sorcerer();

        /* добавление нового заклинания */
        mage.addSpell("Chain Lightning", 6);

        /* удаление заклинания */
        mage.removeSpell("Fireball");
    }
}
