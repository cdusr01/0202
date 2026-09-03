package ru.skyrkov.L2;

import ru.skyrkov.L2.service.Resources;

public class L2t1 {
    public static void main(String[] args) {
        long inputGold = 200L;
        byte inputSilver = 39;
        short inputWood = 2005;
        long inputHealth = 97L;
        boolean inputHasHelper = true;

        Resources characterResources = new Resources(
                inputGold,
                inputSilver,
                inputWood,
                inputHealth,
                inputHasHelper
        );

        int characterGold = (int) inputGold;
        int characterSilver = (int) inputSilver * 100;
        double characterWood = inputWood;
        byte characterHealth = (byte) inputHealth;
        byte characterHelpersNumber = (byte) (inputHasHelper ? 1 : 0);
        ;

        class Character {
            int gold;
            int silver;
            double wood;
            byte health;
            byte helpersNumber;

            public Character(
                    int characterGold,
                    int characterSilver,
                    double characterWood,
                    byte characterHealth,
                    byte characterHelpersNumber
            ) {
                gold = characterGold;
                silver = characterSilver;
                wood = characterWood;
                health = characterHealth;
                helpersNumber = characterHelpersNumber;
            }
        }
        Character character = new Character(
                characterGold,
                characterSilver,
                characterWood,
                characterHealth,
                characterHelpersNumber
        );

        System.out.println("Персонаж создан успешно!");
        System.out.println("Количество золота: " + character.gold);
        System.out.println("Количество серебра: " + character.silver);
        System.out.println("Количество дерева: " + character.wood);
        System.out.println("Здоровье: " + character.health);
        System.out.println("Количество помощников: " + character.helpersNumber);
        System.out.println("Навстречу приключениям!");
    }
}