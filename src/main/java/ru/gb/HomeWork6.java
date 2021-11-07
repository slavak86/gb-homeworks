package ru.gb;

public class HomeWork6 {

    public static void main(String[] args) {
        Dog dog= new Dog("Бобик");
        Dog dog1 = new Dog("Шарик");
        Cat cat = new Cat("Мурзик");
        dog.run(450);
        dog.swim(11);
        cat.run(201);
        cat.swim(1);
        System.out.println("Создано собак " + Dog.dogCount);
        System.out.println("Создано кошек " + Cat.catCount);
//        System.out.println("Всего создано животных " + Animal.count);
    }
}
