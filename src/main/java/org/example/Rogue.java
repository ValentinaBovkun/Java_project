package org.example;
import java.util.Objects;
public abstract class Rogue implements Hero
{
    private Integer health = 100;
    private Integer agility = 20;
    private boolean defending = false;
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public void attack(Hero enemy)
    {
        if (agility >= 5)
        {
            System.out.println("Плут атакует ударом кинжала.");
            agility -= 5;
            if (isDefending())
            {
                enemy.takeDamage(8);
            }
            else
            {
                enemy.takeDamage(15);
            }
        }
        else
        {
            System.out.println("Недостаточно ловкости для атаки.");
        }
    }
    @Override
    public void defend()
    {
        System.out.println("Уклон от атаки.");
        agility -= 2;
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
        System.out.println("Плут получил " + damage + " урона. Здоровье: " + health);
    }
    @Override
    public void useSkill(Hero enemy)
    {
        if (agility >= 10)
        {
            specialSkill();
            agility -= 10;
            if (isDefending())
            {
                enemy.takeDamage(10);
            }
            else
            {
                enemy.takeDamage(20);
            }
        }
        else
        {
            System.out.println("Недостаточно ловкости для специальной атаки.");
            agility += 5;
        }
    }
    @Override
    public void useUltimateAbility(Hero enemy)
    {
        if (agility >= 10)
        {
            System.out.println("Плут использует свою ульту и наносит критический урон.");
            agility -= 10;
            if (isDefending())
            {
                enemy.takeDamage(28);
            }
            else
            {
                enemy.takeDamage(54);
            }
        }
        else
        {
            System.out.println("Недостаточно ловкости для ульты.");
            agility += 5;
        }
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": Health = " + getHealth() + ", Mana = " + getAgility();
    }

    private int getAgility() {
        return agility;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rogue)) {
            return false;
        }
        Rogue other = (Rogue) obj;
        return health.equals(other.health) && agility.equals(other.agility);
    }
    @Override
    public int hashCode() {
        return Objects.hash(health, agility);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}