package ru.skyrkov.L6.t1;

public class Practicum {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.drawCircle();
        Square square = new Square();
        square.drawSquare();
        Rectangle rectangle = new Rectangle();
        rectangle.drawRectangle();
        Ellipse ellipse = new Ellipse();
        ellipse.drawCircle();
        ellipse.circleToEllipse();
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

class Circle extends Figure{
}

class Square extends Figure {
}

class Rectangle extends Figure{
}

class Ellipse extends Circle {
    public void circleToEllipse() {
        System.out.println("Превращаем круг в овал");
    }
}