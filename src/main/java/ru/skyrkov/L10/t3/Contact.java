package ru.skyrkov.L10.t3;

public abstract class Contact {

    private final String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage();

    public abstract void print();
}
