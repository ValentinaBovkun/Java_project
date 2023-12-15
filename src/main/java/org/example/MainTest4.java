package org.example;
import java.time.LocalDateTime;
public class MainTest4 {
    public static void main(String[] args) {
        Mage mage = new Sorcerer();

        /* добавление нового заклинания */
        mage.addSpell("Chain Lightning", 6);

        /* удаление заклинания */
        mage.removeSpell("Fireball");

        // получение даты и времени создания объекта Mage и вывод на экран
        LocalDateTime creationDateTime = mage.getCreationDate();
        System.out.println("Дата и время создания мага: " + creationDateTime);
    }
}
