package ru.skyrkov.L1;

import java.util.Random;

public class L1t2 {
    static void main(String[] args) {
        String[] weathers = {"Дождь", "Ясно"};

        Random rand = new Random();
        String weather = weathers[rand.nextInt(weathers.length)];

        if (weather.equals("Дождь")) {
            System.out.println("Беру с собой зонт");
        } else {
            System.out.println("Иду налегке");
        }
        System.out.println("Люблю гулять!");
    }
}
