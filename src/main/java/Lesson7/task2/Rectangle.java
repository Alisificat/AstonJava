package Lesson7.task2;

// Класс для прямоугольника
public class Rectangle implements Shape {
    private double width;
    private double height;

    /**
     * Конструктор для создания объекта Rectangle.
     * @param width Ширина прямоугольника
     * @param height Высота прямоугольника
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Perimeter() {
        return 2 * (width + height);
    }

    public double Area() {
        return width * height;
    }
    /**
     * Метод возвращает название фигуры
     * @return Название фигуры
     */
    public String getShapeName() {
        return "Прямоугольник";
    }
}
