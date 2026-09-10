package ru.skyrkov.L6.t5;

public class SoupBase {
    double water;
    double salt;

    public SoupBase(double water, double salt) {
        this.water = water;
        this.salt = salt;
    }


    public void printIngredients() {
        System.out.println("Ингредиенты суповой основы:");
        System.out.println("Вода: " + water + " л.");
        System.out.println("Соль: " + salt + " г.");
    }
}