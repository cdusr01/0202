package ru.skyrkov.L10.t3;

import java.util.ArrayList;

public class ContactBook<T extends Contact> {

    private final ArrayList<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false;

        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                contactPresented = true;
                break;
            }
        }

        if (!contactPresented) {
            System.out.println("Не найден контакт с указанным именем.");
        }
    }
}