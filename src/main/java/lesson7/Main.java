class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    static int count;

      /**
     * Конструктор класса Animal.
     *
     * @param name            Имя животного
     * @param maxRunDistance  Максимальная дистанция для бега
     * @param maxSwimDistance Максимальная дистанция для плавания
     */
    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

 /**
     * Метод run для животного.
     *
     * @param distance Длина препятствия для бега
     */

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

     /**
     * Метод swim для животного.
     *
     * @param distance Длина препятствия для плавания
     */
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м.");
        }
    }
}

class Cat extends Animal {
    int appetite;
    boolean isHungry;

    public Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, 0);
        this.appetite = 5;
        this.isHungry = true;
    }

    public void eat(Bowl bowl) {
        if (bowl.food >= appetite) {
            bowl.decreaseFood(appetite);
            System.out.println(name + " поел.");
            isHungry = false;
        } else {
            System.out.println("В миске не хватает еды.");
        }
    }
}

class Dog extends Animal {
    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
    }
}

class Bowl {
    int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            food = 0;
        }
    }

    public void addFood(int amount) {
        food += amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 200), new Cat("Murzik", 150)};
        Bowl bowl = new Bowl(15);

        System.out.println("Количество созданных животных: " + Animal.count);
        System.out.println("Информация о корме в миске: " + bowl.food + " еды.");

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("--------------------------------------");
        for (Cat cat : cats) {
            System.out.println(cat.name + " голоден: " + cat.isHungry);
        }
    }
}
