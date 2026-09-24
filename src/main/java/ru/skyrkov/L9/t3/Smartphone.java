package ru.skyrkov.L9.t3;

// допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone {

    public Smartphone(String number) {
        super(number);
    }

    // перегрузка makeCall для звонка через приложение
    public void makeCall(String targetNumber, String appName) {
        System.out.println("Звоним с номера " + "TODO"); // номер можно взять из родителя, если нужно
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        System.out.println("Привет!");
    }

    // отправка email
    public void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }
}