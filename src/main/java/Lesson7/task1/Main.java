package Lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");

        int minValue = 1;
        int maxValue = 550;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));

        dogBobik.run(randomValue);
        dogBobik.swim(8);

        catMurzik.run(randomValue);
        catMurzik.swim(randomValue);

        System.out.println("Количество созданных животных: " + Animal.count);
        System.out.println("Количество созданных кошек: " + Cat.getCatCount());
        System.out.println("Количество созданных собак: " + Dog.getDogCount());
        System.out.println("----------------------");

        //-------------------------------------------------------------//
        Cat[] cats = new Cat[5]; // Создаем массив из 3 котов
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот " + (i + 1)); // Инициализируем котов
        }
        //-------------------------------------------------------------//
        Bowl bowl = new Bowl(45); // Создаем миску с едой

         for (int i = 0; i < cats.length; i++) {
             int foodTaken = bowl.getFood(10);
             cats[i].eat(foodTaken);
             if (i < cats.length - 1) {
                 System.out.print("\nОсталось в миске " + bowl.FoodAmount() + " --> ");
             }
         }

        for (Cat cat : cats) {
            if (cat.fullness) {
                System.out.println(cat.name + " сыт.");
            } else {
                System.out.println(cat.name + " голоден.");
            }

        }

        catMurzik.eat(bowl.getFood(10));
        System.out.println("Осталось в миске " + bowl.FoodAmount());
        bowl.addFood(10);
        catMurzik.eat(bowl.getFood(10));
    }
}