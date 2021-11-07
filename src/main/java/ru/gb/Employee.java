package ru.gb;

public class Employee {
    String full_name;
    String position;
    String email;
    String phone;
    double salary;
    int age;

    Employee(String full_name, String position, String email, String phone, double salary, int age) {
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    void print() {
        System.out.println("ФИО: " + full_name +
                "\nДолжность: " + position +
                "\nemail: " + email +
                "\nТелефон: " + phone +
                "\nЗарплата: " + salary +
                "\nВозраст: " + age);
    }
}
