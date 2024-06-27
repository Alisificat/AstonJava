package Lesson7.task2;

/**
 * Интерфейс Shape описывает базовые методы для геометрических фигур: расчет периметра и площади.
 * Методы:
 * - Perimeter(): Вычисляет периметр фигуры.
 * - Area(): Вычисляет площадь фигуры.
 * - draw(String fillColor, String borderColor): Выводит характеристики фигуры, включая периметр, площадь, цвет фона и цвет границы.
 */

interface Shape {
    double Perimeter();
    double Area();
    default void draw(String fillColor, String borderColor) {
        System.out.println("-----------------------\nХарактеристики фигуры:");
         System.out.println( getShapeName());
        System.out.println("Периметр: " + Perimeter());
        System.out.println("Площадь: " + Area());
        System.out.println("Цвет фона: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
     default String getShapeName() {
        return "Фигура";
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.draw("Синий", "Черный");

        Rectangle rectangle = new Rectangle(4, 3);
        rectangle.draw("Зеленый", "Красный");

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.draw("Желтый", "Серый");
    }
}