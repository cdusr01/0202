package ru.skyrkov.L6;


public class task1 {
    public static void main(String[] args) {
        Figure circle = new Circle();
        Figure square = new Square();
        Figure rectangle = new Rectangle();
        Ellipse ellipse = new Ellipse(); // или Figure ellipse = new Ellipse();

        circle.drawCircle();      // круг
        square.drawSquare();      // квадрат
        rectangle.drawRectangle(); // прямоугольник
        ellipse.drawCircle();     // круг (переопределен в Ellipse)
        ellipse.circleToEllipse(); // круг в овал
    }
}

class Figure {
    public void drawCircle() {
        System.out.println("Рисуем круг");
    }

    public void drawSquare() {
        System.out.println("Рисуем квадрат");
    }

    public void drawRectangle() {
        System.out.println("Рисуем прямоугольник");
    }
}

class Circle extends Figure {
    // Наследует все методы от Figure
}

class Square extends Figure {
    // Наследует все методы от Figure
}

class Rectangle extends Figure {
    // Наследует все методы от Figure
}

class Ellipse extends Circle {
    @Override
    public void drawCircle() {
        System.out.println("Рисуем круг");
    }

    public void circleToEllipse() {
        System.out.println("Превращаем круг в овал");
    }
}
