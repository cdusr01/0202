package ru.skyrkov.L8.t3;

public class Task {
    // добавьте переменную priority с приоритетом задачи
    private TaskPriority priority;
    private String description;

    public Task(String description, TaskPriority priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public TaskPriority getPriority() {
        return priority;
    }
}
