package org.example;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Hero hero1 = getRandomHero();
        Hero hero2;
        do
        {
            hero2 = getRandomHero();
        } while (hero1.getClass() == hero2.getClass());

        System.out.println("Бой начинается!");

        System.out.println(hero1.getClass().getSimpleName() + " против " + hero2.getClass().getSimpleName());
        System.out.println("************************");
        Random random = new Random();

        while (hero1.getHealth() > 0 && hero2.getHealth() > 0)
        {
            int action1 = random.nextInt(4); // Случайное действие для героя 1
            int action2 = random.nextInt(4); // Случайное действие для героя 2

            performAction(hero1, hero2, action1);
            performAction(hero2, hero1, action2);

            System.out.println("-------------------------");
            System.out.println(hero1.getClass().getSimpleName() + ": Здоровье = " + hero1.getHealth());
            System.out.println(hero2.getClass().getSimpleName() + ": Здоровье = " + hero2.getHealth());
            System.out.println("-------------------------");
        }

        if (hero1.getHealth() <= 0)
        {
            System.out.println(hero1.getClass().getSimpleName() + " проиграл!");
        }
        else
        {
            System.out.println(hero2.getClass().getSimpleName() + " проиграл!");
        }
    }

    // Получаем случайного героя
    private static Hero getRandomHero()
    {
        Random random = new Random();
        switch (random.nextInt(5))
        {
            case 0:
                return new Sorcerer();
            case 1:
                return new Duelist();
            case 2:
                return new Witch();
            case 3:
                return new Phantom();
            case 4:
                return new Warlock();
        }
        return null;
    }
    private static void performAction(Hero attacker, Hero target, int action)
    {
        switch (action)
        {
            case 0:
                attacker.attack(target);
                break;
            case 1:
                attacker.defend();
                break;
            case 2:
                attacker.useSkill(target);
                break;
            case 3:
                attacker.useUltimateAbility(target);
                break;
            default:
                break;
        }
    }
}