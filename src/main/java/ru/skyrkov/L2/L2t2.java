package ru.skyrkov.L2;
import java.util.Scanner;

import java.util.Scanner;

public class L2t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.openRubAccount();
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.openUsdAccount();
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.openEurAccount();
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.isRubAccountOpen()) {
            System.out.println("- RUB");
        }
        if (user.isUsdAccountOpen()) {
            System.out.println("- USD");
        }
        if (user.isEurAccountOpen()) {
            System.out.println("- EUR");
        }
    }
}

class Account {
    private double balance;
    private boolean isOpen;

    Account() {
        this.balance = 0.0;
        this.isOpen = true;
    }

    double getBalance() {
        return balance;
    }

    boolean isOpen() {
        return isOpen;
    }
}

class PersonAccount {
    String name;

    private Account rubAccount;
    private Account usdAccount;
    private Account eurAccount;

    PersonAccount(String userName) {
        name = userName;}

    void openRubAccount() {
        if (rubAccount == null) {
            rubAccount = new Account();
        }
    }

    void openUsdAccount() {
        if (usdAccount == null) {
            usdAccount = new Account();
        }
    }

    void openEurAccount() {
        if (eurAccount == null) {
            eurAccount = new Account();
        }
    }

    boolean isRubAccountOpen() {
        return rubAccount != null && rubAccount.isOpen();
    }

    boolean isUsdAccountOpen() {
        return usdAccount != null && usdAccount.isOpen();
    }

    boolean isEurAccountOpen() {
        return eurAccount != null && eurAccount.isOpen();
    }
}