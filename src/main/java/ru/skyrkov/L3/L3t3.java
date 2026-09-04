package ru.skyrkov.L3;

import java.util.ArrayList;

public class L3t3 {
    private ArrayList<String> animals = new ArrayList<>();

    private void getSchedule(){
        System.out.println("Расписание кормлений:");

        System.out.println("В 9:00 - " + animals.get(1));
        System.out.println("В 10:00 - " + animals.get(4));
        System.out.println("В 11:00 - " + animals.get(0));
        System.out.println("В 12:00 - " + animals.get(2));
        System.out.println("В 13:00 - " + animals.get(3));
    }

    private void allAnimals(){
        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + " животных.");
        System.out.println("Это будут:");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    private void addAnimal(String animal){
        animals.add(animal);
    }

    private void removeAnimal(String animal){
        if (animals.isEmpty()){
            System.out.println("Список пуст!");
            return;
        }
        animals.remove(animal);
    }

    private void clearAnimals(){
        if (animals.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        animals.clear();
    }

    private boolean containsAnimal(String animal){
        return animals.contains(animal);
    }

    public void main(String[] args) {
        animals.add("Шиншилла");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        allAnimals();
        addAnimal("Тигр");
        allAnimals();
        removeAnimal("Тигр");
        allAnimals();
        System.out.println("Объект" + (containsAnimal("Тигр") ? " есть" : "а нет") + " в списке");
        System.out.println("Объект" + (containsAnimal("Лев") ? " есть" : "а нет") + " в списке");
        clearAnimals();
        allAnimals();
    }
}
