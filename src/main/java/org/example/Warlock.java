package org.example;

public class Warlock extends Mage
{
    public Warlock() {
        /* используем метод addSpell из класса Mage для добавления заклинаний */
        addSpell("Shadow Bolt", 6);
        addSpell("Immolate", 8);
        addSpell("Fear", 10);
    }
    @Override
    public void specialSkill()
    {
        int num_call = (int) ( Math.random() * 4 );
        switch (num_call)
        {
            case 0:
                System.out.println("Чернокнижник призывает демона проклятий.");
                break;
            case 1:
                System.out.println("Чернокнижник призывает демона душ.");
                break;
            case 2:
                System.out.println("Чернокнижник призывает диких бесов.");
                break;
            case 3:
                System.out.println("Чернокнижник призывает суккуба.");
                break;
        }
    }
}