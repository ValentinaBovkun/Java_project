package org.example;
public class MainTest3 {
    public static void main(String[] args) {
        Mage mage = new Sorcerer();
        Rogue rogue = new Duelist();

        try {
            battle(mage);
            battle(rogue);
        } catch (InvalidCharacterException e) {
            System.err.println("Ошибка в характеристиках персонажа: " + e.getMessage());
        } finally {
            System.out.println("Бой завершен.");
        }
    }

    private static void battle(Hero character) throws InvalidCharacterException {
        try {
            if (character instanceof Mage) {
                ((Mage) character).useSkill(character);
            } else if (character instanceof Rogue) {
                ((Rogue) character).useUltimateAbility(character);
            } else {
                throw new InvalidCharacterException("Недопустимый персонаж для боя.");
            }
        } catch (ManaOutOfBoundsException | AgilityOutOfBoundsException e) {
            System.err.println("Ошибка в характеристиках персонажа: " + e.getMessage());
            throw new InvalidCharacterException("Персонаж не может использовать способность.", e); //если персонаж не явл. экземпляром класса Mage или Rogue
        }
    }
}
