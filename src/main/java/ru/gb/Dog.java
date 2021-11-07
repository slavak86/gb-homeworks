package ru.gb;

public class Dog extends Animal {
    final private int RUN_MAX_LENGTH = 500;
    final private int SWIM_MAX_LENGTH = 10;
    static int dogCount;

    public Dog(String name) {
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
        if (length >= 0 && length <= SWIM_MAX_LENGTH) {
            System.out.println(name + " проплыл " + length + " метров");
        } else {
            System.out.println(name + " утонул");
        }
    }

    @Override
    public void Count(){
        dogCount++;
    }
}
