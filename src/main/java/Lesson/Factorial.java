package Lesson;

public class Factorial {
    public  static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть целым и положительным.");
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
