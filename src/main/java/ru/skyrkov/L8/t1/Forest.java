package ru.skyrkov.L8.t1;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        season = newSeason;
        if (season.equals("зима")) {
            MountainHare.color = "белый";
        } else if (season.equals("лето")) {
            MountainHare.color = "серо-рыжий";
        }
    }
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}
