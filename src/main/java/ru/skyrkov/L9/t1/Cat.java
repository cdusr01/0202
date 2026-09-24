package ru.skyrkov.L9.t1;

public class Cat extends Pet{
    public Cat() {
        super("Мяу", 4);
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }
}
