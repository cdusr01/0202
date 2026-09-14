package ru.skyrkov.L8.t3;

import java.util.ArrayList;

public class Practicum {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Оплатить интернет.", TaskPriority.HIGH));
        tasks.add(new Task("Сходить в парикмахерскую.", TaskPriority.LOW));
        tasks.add(new Task("Выбрать подарок подруге на ДР.", TaskPriority.MEDIUM));
        tasks.add(new Task("Купить билеты в театр.", TaskPriority.MEDIUM));
        tasks.add(new Task("Посетить вебинар по английскому языку.", TaskPriority.HIGH));
        tasks.add(new Task("Купить пылесос.", TaskPriority.LOW));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");
        for (Task task : tasks) {
            if (task.getPriority() == TaskPriority.HIGH) {
                System.out.println(task.getDescription());
            }
        }
    }
}
