package ru.gb.homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        }
    }

    public void info() {
        System.out.println("Еды в тарелке " + food);
    }

    public int getFood() {
        return food;
    }

    public void increaseFood(int amount) {
        food += amount;
        System.out.println("В тарелку добавили " + amount + " еды");
    }
}
