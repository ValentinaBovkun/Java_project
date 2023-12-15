package org.example;

public class Witch extends Mage
{
    public Witch() {
        /* используем метод addSpell из класса Mage для добавления заклинаний */
        addSpell("Shadow Bolt", 6);
        addSpell("Immolate", 8);
        addSpell("Fear", 10);
    }
    @Override
    public void specialSkill()
    {
        int num_hex = (int) ( Math.random() * 4 );
        switch (num_hex)
        {
            case 0:
                System.out.println("Ведьма использует навык -Сглаз-.");
                break;
            case 1:
                System.out.println("Ведьма использует навык -Агония-.");
                break;
            case 2:
                System.out.println("Ведьма использует навык -Мороз-.");
                break;
            case 3:
                System.out.println("Ведьма призывает природного союзника.");
                break;
        }
    }
}