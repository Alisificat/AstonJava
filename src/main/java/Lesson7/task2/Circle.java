package Lesson7.task2;

// Класс для круга
public class Circle implements Shape {
    private double radius;

    /**
     * Конструктор для создания объекта Circle.
     * @param radius Радиус круга
     */

    public Circle(double radius) {
        this.radius = radius;
    }

     /**
     * Метод вычисляет периметр круга.
     * @return Периметр круга
     */
     public double Perimeter() {
        return 2 * Math.PI * radius;
    }
    /**
     * Метод вычисляет площадь круга.
     * @return Площадь круга
     */
    public double Area() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод возвращает название фигуры
     * @return Название фигуры
     */
    public String getShapeName() {
        return "Круг";
    }
}
