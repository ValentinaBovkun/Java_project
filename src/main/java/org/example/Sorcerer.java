package org.example;

public class Sorcerer extends Mage
{
    public Sorcerer() {
        /* используем метод addSpell из класса Mage для добавления заклинаний */
        addSpell("Shadow Bolt", 6);
        addSpell("Immolate", 8);
        addSpell("Fear", 10);
    }
    @Override
    public void specialSkill()
    {
        int num_element = (int) (Math.random() * 4);
        switch (num_element)
        {
            case 0:
                System.out.println("Чародей кастует заклинание огня.");
                break;
            case 1:
                System.out.println("Чародей кастует заклинание воды.");
                break;
            case 2:
                System.out.println("Чародей кастует заклинание ветра.");
                break;
            case 3:
                System.out.println("Чародей кастует заклинание земли.");
                break;
        }
    }
}