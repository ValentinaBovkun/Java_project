package org.example;
import java.time.LocalDateTime;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

        /* запись объекта в файл */
        writeToObjectsFile("objects.txt", mage.toString() + "\n" + creationDateTime);
    }
    /* сама запись данных в файл */
    public static void writeToObjectsFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Объекты записаны в файл: " + fileName);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

}
