package org.example;

public class Witch extends Mage
{
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
                System.out.println("Ведьма использует навык -Изьморозь-.");
                break;
            case 3:
                System.out.println("Ведьма призывает природного союзника.");
                break;
        }
    }
}