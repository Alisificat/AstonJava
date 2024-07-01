package Lesson8;

/**
 * Исключение MyArraySizeException, которое выбрасывается при неверном размере массива.
 */
class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неверный размер массива!");
    }
}

/**
 * Исключение MyArrayDataException, которое выбрасывается при неверных данных в массиве.
 */

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

/**
 * Класс Main содержит метод для работы с двумерным строковым массивом.
 */
class Main {

    public static void main(String[] args) {
        String[][] validData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "h", "15", "16"}
        };

        String[][] invalidData = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };

        try {
            int sum = SumValidArray.sumValidArray(validData);
            System.out.println("Сумма всех элементов валидного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try {
            int sum = SumValidArray.sumValidArray(invalidData);
            System.out.println("Сумма всех элементов невалидного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


}

class SumValidArray {
    public static int sumValidArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i +"][" + 1 + j + "]");
                }
            }
        }

        return sum;
    }
}