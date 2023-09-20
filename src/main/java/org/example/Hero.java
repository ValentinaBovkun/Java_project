package org.example;

public interface Hero
{
    void attack(Hero enemy);
    void defend();
    void useSkill(Hero enemy);
    void useUltimateAbility(Hero enemy);

    void specialSkill();
    void takeDamage(int i);
    int getHealth();
}
