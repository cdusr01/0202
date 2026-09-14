package ru.skyrkov.L8.t2;

import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");
        // считайте сумму перевода при помощи scanner.nextDouble()
        double amount = scanner.nextDouble();

        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
    }
}

