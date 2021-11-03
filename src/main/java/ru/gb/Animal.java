package ru.gb;

public abstract class Animal {
    int run;
    int swim;
    String name;
    static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount();
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    public void animalCount(){
        animalCount++;
    }
}
