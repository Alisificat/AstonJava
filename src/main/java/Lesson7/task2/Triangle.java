package Lesson7.task2;

// Класс для треугольника
public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * Конструктор для создания объекта Triangle.
     * @param side1 Длина первой стороны треугольника
     * @param side2 Длина второй стороны треугольника
     * @param side3 Длина третьей стороны треугольника
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double Perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double Area() {
        double s = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    /**
     * Метод возвращает название фигуры
     * @return Название фигуры
     */
     public String getShapeName() {
        return "Треугольник";
    }
}
