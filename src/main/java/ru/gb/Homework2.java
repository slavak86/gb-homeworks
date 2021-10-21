package ru.gb;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(with10to20(10, 20));
        isPositiveOrNegative(-2);
        System.out.println(isNegative(0));
    }

    private static boolean with10to20(int number1, int number2) {
        return (number1 + number2) >= 10 && (number1 + number2) <= 20;

    }

    private static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative (int x) {
        return x < 0;
    }

}
