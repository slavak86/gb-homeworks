package ru.gb;

public class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        System.out.println(); //Перенос на новую строку второе задание.
        fillArray();
        changeArray();
        fillDiagonal();
        retLenArr(10, 7);
        arrayMaxMinElement();
    }

    public static void invertArray() {
        int array[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.printf("%d ", array[i]);

        }
    }

    public static void fillArray() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.printf("array[%02d] = %d\n", i, array[i]);
        }
    }

    public static void changeArray() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.printf("%d ", array[i]);
        }
    }

    public static void fillDiagonal() {
        int array[][] = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, x = array[i].length; j < array[i].length; j++, x--) {
                if (i == j || i == x - 1) array[i][j] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void retLenArr(int len, int initialValue){
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
            System.out.printf("%d ", array[i]);
        }
        return;

    }

    public static void arrayMaxMinElement() {
        int[] array = {15, 26, 37, 8, 16, 22, 58, -7, -19, 12, 30};

        int min = 0, max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nMin element: " + min + ", Max element: " + max);
    }
}

