package ru.gb;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(with10to20(10, 20));
    }

    private static boolean with10to20(int number1, int number2) {
        return (number1 + number2) >= 10 && (number1 + number2) <= 20;

    }
}
