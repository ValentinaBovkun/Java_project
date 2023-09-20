package org.example;

public abstract class Mage implements Hero
{
    private int health = 100;
    private int mana = 50;
    private boolean defending = false;
    @Override
    public int getHealth()
    {
        return health;
    }
    @Override
    public void attack(Hero enemy)
    {
        if (mana >= 10)
        {
            System.out.println("Магический залп.");
            mana -= 10;
            if (isDefending()) {
                enemy.takeDamage(10);
            }
            else
            {
                enemy.takeDamage(20);
            }
        }
        else
        {
            System.out.println("Недостаточно маны для атаки.");
        }
    }

    @Override
    public void defend()
    {
        System.out.println("Магический барьер.");
        mana -= 2;
        defending = true; //защита активна
    }
    public boolean isDefending()
    {
        return defending;
    }
    public void setDefending(boolean defending)
    {
        this.defending = defending;
    }
    public void takeDamage(int damage)
    {
        health -= damage;
        System.out.println("Маг получил " + damage + " урона. Здоровье: " + health);
    }
    @Override
    public void useSkill(Hero enemy)
    {
        if (mana >= 15)
        {
            specialSkill();
            mana -= 15;
            if (isDefending())
            {
                enemy.takeDamage(13);
            }
            else
            {
                enemy.takeDamage(25);
            }
        }
        else
        {
            System.out.println("Недостаточно маны для специальной атаки.");
            mana += 5;
        }
    }
    @Override
    public void useUltimateAbility(Hero enemy)
    {
        if (mana >= 25)
        {
            System.out.println("Маг использует свою ульту и наносит большой урон.");
            mana -= 25;
            if (isDefending())
            {
                enemy.takeDamage(25);
            }
            else
            {
                enemy.takeDamage(50);
            }
        }
        else
        {
            System.out.println("Недостаточно маны для ульты.");
            mana += 5;
        }
    }
}