package ru.gb;

public class Cat extends Animal {
    final private int RUN_MAX_LENGTH = 200;
    static int catCount = 0;

    public Cat(String name) {
        super(name);
    }
    @Override
    public void run(int length) {
        if (length >= 0 && length <= RUN_MAX_LENGTH) {
            System.out.println(name + " пробежал " + length + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + length + " метров");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать");
    }

    @Override
    public void animalCount(){
        catCount++;
    }

}
