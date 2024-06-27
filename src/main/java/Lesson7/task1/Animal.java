package Lesson7.task1;

//public class Animal {
//    String name;
//    int maxRunDistance;
//    int maxSwimDistance;
//    static int count;
//
//      /**
//     * Конструктор класса Animal.
//     *
//     * @param name            Имя животного
//     * @param maxRunDistance  Максимальная дистанция для бега
//     * @param maxSwimDistance Максимальная дистанция для плавания
//     */
//    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
//        this.name = name;
//        this.maxRunDistance = maxRunDistance;
//        this.maxSwimDistance = maxSwimDistance;
//        count++;
//    }
//
// /**
//     * Метод run для животного.
//     *
//     * @param distance Длина препятствия для бега
//     */
//
//    public void run(int distance) {
//        if (distance <= maxRunDistance) {
//            System.out.println(name + " пробежал " + distance + " м.");
//        } else {
//            System.out.println(name + " не может пробежать " + distance + " м.");
//        }
//    }
//
//     /**
//     * Метод swim для животного.
//     *
//     * @param distance Длина препятствия для плавания
//     */
//    public void swim(int distance) {
//        if (maxSwimDistance == 0) {
//            System.out.println(name + " не умеет плавать.");
//        } else if (distance <= maxSwimDistance) {
//            System.out.println(name + " проплыл " + distance + " м.");
//        } else {
//            System.out.println(name + " не может проплыть " + distance + " м.");
//        }
//    }
//}
public abstract class Animal {
    static int animalCount = 0;
      String name;
     static int count;
      /**
     * Конструктор класса Animal.
     *
     * @param name   Имя животного
     */
    public Animal(String name) {
        this.name = name;
        count++;
    }

    public abstract void run(int lenght);

    public abstract void swim(int lenght);

}