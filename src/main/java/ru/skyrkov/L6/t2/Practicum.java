package ru.skyrkov.L6.t2;

class Practicum {
    public static void main(String[] args) {
        ModelQ testCar = new ModelQ();

        System.out.println("Характеристики модели:");
        System.out.println("Ускорение: " + testCar.acceleration + " км/(ч*с)");
        System.out.println("Максимальная скорость: " + testCar.maxSpeed + " км/ч");
        // Символ \n позволяет оставлять пустую строку в консоли
        System.out.println("\nНачало теста!");
        System.out.println("Количество колёс: " + testCar.wheelsNumber);

        testCar.turnTo("Север");
        System.out.println("Направление: " + testCar.direction);
        System.out.println("Едем на автопилоте:");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Q спустя 5с на автопилоте: " + testCar.speed + " км/ч");
        for (int second = 0; second < 5; second++) {
            testCar.accelerateByAutopilot();
        }
        System.out.println("Скорость Q спустя ещё 5с на автопилоте: " + testCar.speed + " км/ч");

        System.out.println("Переходим в ручной режим:");
        for (int second = 0; second < 2; second++) {
            testCar.accelerate();
        }
        System.out.println("Скорость Q спустя 2с в ручном режиме: " + testCar.speed + " км/ч");
        System.out.println("Проверяем торможение:");
        int brakingTime = 0;
        while (testCar.speed > 0) {
            testCar.brake();
            brakingTime++;
        }
        System.out.println("Время торможения до полной остановки: " + brakingTime + "c");
    }
}

class Transport {
    protected double speed;
    protected double maxSpeed;
    protected double acceleration;
    protected double brakingSpeed;
    protected int wheelsNumber;

    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}

class Automobile extends Transport{
    public Automobile() {
        wheelsNumber = 4;
    }

    protected String direction;

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}

class Train extends Transport {
    public Train() {
        wheelsNumber = 8;
    }

    private boolean isLocomotive;

    public void turnToLocomotive() {
        isLocomotive = true;
    }

    public void turnToСarriage() {
        isLocomotive = false;
    }
}

class TexlaCar extends Automobile{
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public TexlaCar() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 10;
    }

    protected void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        }
    }
}

class TexlaTruck extends TexlaCar{
    protected double maxSpeedByDirt;

    public TexlaTruck() {
        maxSpeedByDirt = 30;
    }

    public void accelerateByDirt() {
        if (speed < maxSpeedByDirt) {
            speed += acceleration * 0.5;
        }
    }

    public void brakeByDirt() {
        if (speed > 0) {
            speed -= brakingSpeed * 0.5;
        }
    }
}

class ModelQ extends TexlaCar {
    public ModelQ() {
        speed = 0;
        maxSpeed = 300;
        acceleration = 100;
        brakingSpeed = 120;
    }
}

class ModelP extends TexlaCar {
    public ModelP() {
        speed = 0;
        maxSpeed = 120;
        acceleration = 10;
        brakingSpeed = 50;
    }
}