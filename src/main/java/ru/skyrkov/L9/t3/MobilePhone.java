package ru.skyrkov.L9.t3;

public class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    public void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}