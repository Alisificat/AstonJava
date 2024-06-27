package Lesson7.task1;

/**
 * Класс Bowl представляет миску с едой.
 * Содержит методы для получения еды из миски и для добавления еды в миску.
 */
public class Bowl {
    private int foodAmount;

    /**
     * Создает новую миску с заданным количеством еды.
     * @param foodAmount Количество еды в миске
     */
    public Bowl(int foodAmount) {

        this.foodAmount = foodAmount;
    }

    /**
     * Метод getFood позволяет  кушать из миски.
     * Если в миске не хватает еды,  нет возможности покушать.
     */
    public int getFood(int countFood) {
        if (foodAmount >= countFood) {
            foodAmount -= countFood;
            return countFood;
        } else {
            foodAmount = 0;
            return 0; // Возвращаем 0, если в миске недостаточно еды
        }
    }
    /**
     * Метод addFood позволяет добавить еду в миску.
     * @param amount Количество еды для добавления
     */
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавили " + amount);
        }
    }
       /**
     * Метод FoodAmount возвращает количество еды в миске
     */
     public int FoodAmount() {
        return foodAmount;
    }


}
