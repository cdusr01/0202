package ru.skyrkov.L8.t1;

public class MountainHare {

    private int age;
    private double weight;
    private int jumpLength;
    public static String color;

    public MountainHare(int age, double weight, int jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}
