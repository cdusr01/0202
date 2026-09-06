package ru.skyrkov.L5.t1;

public class WorkCalculator {

    private int workingHours = 8;
    private String workerName;
    public double coefficient;

    public WorkCalculator(String newName) {
        workerName = newName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public int calculate(int workDays) {
        return workDays * workingHours;
    }

    public double calculateWithCoefficient(int workDays) {
        return workDays * workingHours * coefficient;
    }
}
