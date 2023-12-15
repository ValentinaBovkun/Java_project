package org.example;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;

public abstract class Mage implements Hero
{
    private Map<String, Integer> spellCooldowns;
    private Integer health = 100; //здоровье как класс-обертка
    private Integer mana = 50; //мана как класс-обертка
    private boolean defending = false;
    public Mage() {
        spellCooldowns = new HashMap<>();
        /* инициализируем значения заклинаний со временем восстановления */
        spellCooldowns.put("Fireball", 5);
        spellCooldowns.put("Frost Nova", 8);
        spellCooldowns.put("Arcane Missile", 3);
    }
    /* добавление заклинания и его времени восстановления в коллекцию */
    public void addSpell(String spellName, int cooldown) {
        spellCooldowns.put(spellName, cooldown);
    }

    /* получение времени восстановления заклинания по его названию */
    public int getSpellCooldown(String spellName) {
        return spellCooldowns.getOrDefault(spellName, -1);
    }

    /* удаление заклинания из коллекции */
    public void removeSpell(String spellName) {
        spellCooldowns.remove(spellName);
    }

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
    public void useSkill(Hero enemy) throws ManaOutOfBoundsException
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
            mana += 5;
            throw new ManaOutOfBoundsException("Недостаточно маны для специальной атаки.");
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
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": Здоровье = " + getHealth() + ", Мана = " + getMana();
    }

    private int getMana() {
        return mana;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mage)) {
            return false;
        }
        Mage other = (Mage) obj;
        return health.equals(other.health) && mana.equals(other.mana);
    }
    @Override
    public int hashCode() {
        return Objects.hash(health, mana);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}