package ru.skyrkov.L9.t2;

public class Rhombus extends Parallelogram{
    private final double a;
    // Высота ромба
    private final double h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}
