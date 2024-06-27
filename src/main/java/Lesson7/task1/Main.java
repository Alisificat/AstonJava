package Lesson7.task1;

/**
 * Класс Cat является подклассом Animal и представляет кота.
 * Унаследованы методы и поля от класса Animal, а также добавлено поле fullness для отслеживания сытости.
 */
class Cat extends Animal {
    boolean fullness;

    /**
     * Создает нового кота с заданными параметрами.
     * @param name            Имя кота
     * @param maxRunDistance  Максимальная дистанция для бега
     * @param maxSwimDistance Максимальная дистанция для плавания
     */
    public Cat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        this.fullness = false;
    }

    /**
     * Метод eat позволяет коту покушать из миски.
     * Если в миске достаточно еды, кот становится сытым (fullness = true).
     * @param foodAmount Количество еды в миске
     */
    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            fullness = true;
            System.out.println(name + " покушал из миски.");
        } else {
            System.out.println(name + " не может покушать из миски, так как не хватает еды.");
        }
    }
}

/**
 * Класс Bowl представляет миску с едой.
 * Содержит методы для получения еды из миски и для добавления еды в миску.
 */
class Bowl {
    private int foodAmount;

    /**
     * Создает новую миску с заданным количеством еды.
     * @param foodAmount Количество еды в миске
     */
    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    /**
     * Метод getFood позволяет котам кушать из миски.
     * Если в миске не хватает еды, кот не может покушать.
     * @return Количество еды, которое кот взял из миски
     */
    public int getFood() {
        if (foodAmount >= 10) {
            foodAmount -= 10;
            return 10;
        } else {
            int remainingFood = foodAmount;
            foodAmount = 0;
            return remainingFood;
        }
    }

    /**
     * Метод addFood позволяет добавить еду в миску.
     * @param amount Количество еды для добавления
     */
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик", 500, 10);
        Cat catMurzik = new Cat("Мурзик", 200, 0);

        dogBobik.run(150);
        dogBobik.swim(5);

        catMurzik.run(250);
        catMurzik.swim(3);

        System.out.println("Количество созданных животных: " + Animal.count);
         System.out.println("----------------------");

        Cat[] cats = new Cat[5]; // Создаем массив из 3 котов
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот " + (i + 1), 200, 0); // Инициализируем котов
        }

        Bowl bowl = new Bowl(20); // Создаем миску с едой
        //bowl.addFood(30); // Добавляем еду в миску

        for (Cat cat : cats) {
            int foodTaken = bowl.getFood();
            if (foodTaken > 0) {
                cat.eat(foodTaken);
            }
        }

        for (Cat cat : cats) {
            if (cat.fullness) {
                System.out.println(cat.name + " сыт.");
            } else {
                System.out.println(cat.name + " голоден.");
            }

        }
         System.out.println("----------------------");
         System.out.println("Количество созданных животных: " + Animal.count);
    }
}