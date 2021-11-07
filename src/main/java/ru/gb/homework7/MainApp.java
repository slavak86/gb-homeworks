package ru.gb.homework7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] x = {
                new Cat("Мурзик", 7),
                new Cat("Барсик", 5),
                new Cat("Пушистик", 15)
        };
        Plate plate = new Plate(25);
        plate.info();
        System.out.println("Коты едят из тарелки:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            plate.info();
        }
        plate.increaseFood(100);
        plate.info();
    }
}
