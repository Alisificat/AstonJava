package Lesson7.task2;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Синий", "Черный");
        circle.showInfo();

        Rectangle rectangle = new Rectangle(4, 3, "Зеленый", "Красный");
        rectangle.showInfo();

        Triangle triangle = new Triangle(3, 4, 5, "Желтый", "Серый");
        triangle.showInfo();
    }
}
