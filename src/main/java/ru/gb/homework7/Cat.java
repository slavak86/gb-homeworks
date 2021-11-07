package ru.gb.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean Full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Кот{" +
                "Имя='" + name + '\'' +
                ", Аппетит=" + appetite +
                ", Сытность=" + Full +
                '}';
    }

    public void eat(Plate p) {
        if (p.getFood() > appetite) {
            p.decreaseFood(appetite);
            Full = true;
        }
    }
}
