package ru.gb;

public abstract class Animal {
    int run;
    int swim;
    String name;
    static int count = 0;

    public Animal(String name) {
        this.name = name;
        Count();
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    public void Count(){
       count++;
    }
}
