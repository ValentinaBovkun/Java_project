package org.example;

public class Warlock extends Mage
{
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