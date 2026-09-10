package ru.skyrkov.L6.t3;

public class Practicum {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        Cow cow = new Cow();
        Frog frog = new Frog();
        Elephant elephant = new Elephant();
        Ducks ducks = new Ducks();
        Fish fish = new Fish();
        Seal seal = new Seal();
        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());
        System.out.println("Cow goes " + cow.say());
        System.out.println("Frog goes " + frog.say());
        System.out.println("And the elephant goes " + elephant.say());
        System.out.println("Ducks say " + ducks.say());
        System.out.println("And fish go  " + fish.say());
        System.out.println("And the seal goes  " + seal.say());
    }
}

class Animal {
    public String say() {
        return "I'm an Animal!";
    }
}

class Dog extends Animal{
    @Override
    public String say() {
        return "woof";
    }
}

class Cat extends Animal{
    @Override
    public String say() {
        return "meow";
    }
}

class Bird extends Animal{
    @Override
    public String say() {
        return "tweet";
    }
}

class Mouse extends Animal{
    @Override
    public String say(){
        return "squeek";
    }
}

class Cow extends Animal{
    @Override
    public String say() {
        return "Cow goes moo";
    }
}

class Frog extends Animal{
    @Override
    public String say() {
        return "croak";
    }
}

class Elephant extends Animal{
    @Override
    public String say() {
        return "toot";
    }
}

class Ducks extends Animal{
    @Override
    public String say() {
        return "quack";
    }
}

class Fish extends Animal{
    @Override
    public String say() {
        return "blub";
    }
}

class Seal extends Animal{
    @Override
    public String say() {
        return "ow ow ow";
    }
}