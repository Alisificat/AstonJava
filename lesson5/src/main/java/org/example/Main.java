package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1
        printThreeWords();
        //2
        checkSumSign();
        //3
        printColor();
        //4
        compareNumbers();
        //5
        System.out.println(isSumInRange(10, 5));
        //6
        printIsPositive(0);
        //7
        System.out.println(isNegative(0));
        //8
        printIsString("hi Aston", 3);
        //9
        System.out.println(isLeapYear(2044));
        //10
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        flipBinaryArray(binaryArray);
        //11
        int[] nums = new int[100];
        fillArrayValues(nums);
        //12
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifyArrayValues(array, 6);
        //13
        int[][] mass = new int[4][4];
        fillDiagonalOnes(mass);
        //14
        createIntArray(10, 1);

    }

    /**
     * Метод печатает в столбец три слова: Orange, Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("\nex 1");
        System.out.println("Orange, \nBanana, \nApple  ");
    }

    /**
     * Метод суммирует две переменные и выводит сообщение о знаке суммы.
     */
    public static void checkSumSign() {
       System.out.println("\nex 2");
        int a, b, c;
        a = 50;
        b = 23;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма  отрицательная");
        }

    }

    /**
     * Метод задает переменную value и выводит сообщение о цвете в зависимости от значения переменной.
     */
    public static void printColor() {
         System.out.println("\nex 3");
        int value = 70; // можно задать любое значение

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    /**
     * Метод сравнивает две переменные и выводит сообщение о результате сравнения.
     */
    public static void compareNumbers() {
         System.out.println("\nex 4");
        int a, b;
        a = 50;
        b = 23;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a<b");
        }
    }


    /**
     * Метод проверяет, находится ли сумма двух чисел в диапазоне от 10 до 20 включительно.
     *
     * @param a первое число
     * @param b второе число
     * @return true, если сумма лежит в заданном диапазоне, иначе false
     */
    public static boolean isSumInRange(int a, int b) {
        System.out.println("\nex 5");
        int c = a + b;
        return (c >= 10 && c <= 20);
    }

    /**
     * Метод печатает в консоль, является ли число положительным или отрицательным.
     * Замечание: ноль считаем положительным числом.
     *
     * @param number число для проверки
     */
    public static void printIsPositive(int number) {
         System.out.println("\nex 6");
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
         System.out.println("\nex 7");
        return number <= 0;
    }

    /**
     * Метод печатает указанную строку указанное количество раз.
     *
     * @param str Строка для печати
     * @param a   Количество раз для печати строки
     */
    public static void printIsString(String str, int a) {
        System.out.println("\nex 8");
        for (int i = 0; i < a; i++) {
            System.out.println(str);

        }
    }


    /**
     * Метод определяет, является ли заданный год високосным.
     *
     * @param year Год для проверки
     * @return true, если год високосный, иначе false
     */
    public static boolean isLeapYear(int year) {
        System.out.println("\nex 9");
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод заменяет значения 0 на 1 и 1 на 0 в заданном массиве.
     *
     * @param args Массив, в котором происходит замена
     */
    public static void flipBinaryArray(int[] args) {
        System.out.println("\nex 10");
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 0) {
                args[i] = 1;
            } else {
                args[i] = 0;
            }
            System.out.print((args[i]) + " ");
        }
    }

    /**
     * Метод заполняет массив значениями от 1 до длины массива.
     *
     * @param array Массив, который нужно заполнить
     */
    public static void fillArrayValues(int[] array) {
        System.out.println("\n\nex 11");
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] = i) + " ");
        }
    }

    /**
     * Метод умножает на 2 числа меньшие 6 в заданном массиве.
     *
     * @param array Массив для обработки
     * @param count Пороговое значение для умножения
     */

    public static void modifyArrayValues(int[] array, int count) {
        System.out.println("\n\nex 12");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < count) {
                System.out.print((array[i] *= 2) + " ");
            } else {
                System.out.print((array[i]) + " ");
            }
        }

    }

    /**
     * Метод заполняет диагональные элементы в квадратном массиве единицами.
     *
     * @param array Квадратный двумерный массив
     */
    public static void fillDiagonalOnes(int[][] array) {
        System.out.println("\n\nex 13");
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Метод создает новый одномерный массив с указанной длиной и каждой ячейкой равной initialValue.
     *
     * @param len          Длина нового массива
     * @param initialValue Значение для каждой ячейки массива
     * @return Созданный одномерный массив
     */
    public static int[] createIntArray(int len, int initialValue) {
         System.out.println("\nex 14");
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(newArr[i] = initialValue);
        }
        return newArr;
    }


}
