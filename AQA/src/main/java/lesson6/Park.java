package lesson6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Park {
    private String name;
    private List<Attraction> attractions;

    /**
     * Конструктор класса Park, инициализирует название парка и список аттракционов.
     *
     * @param name Название парка
     */
    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Внутренний класс Attraction представляет аттракцион в парке.
     */
    class Attraction {
        private String name;
        private String workingTime;
        private float cost;

        /**
         * Конструктор класса Attraction, инициализирует аттракцион.
         *
         * @param name        Название аттракциона
         * @param workingTime Время работы аттракциона
         * @param cost        Стоимость аттракциона (тип BigDecimal)
         */
        public Attraction(String name, String workingTime, float cost) {
            this.name = name;
            this.workingTime = workingTime;
            this.cost = cost;
        }

        /**
         * Метод displayInfo выводит информацию об аттракционе в консоль.
         */
        public void displayInfo() {
            System.out.println("Attraction: " + name);
            System.out.println("Working Time: " + workingTime);
            System.out.println("Cost: " + cost);
        }
    }

    /**
     * Метод добавляет аттракцион в список аттракционов парка.
     *
     * @param name        Название аттракциона
     * @param workingTime Время работы аттракциона
     * @param cost        Стоимость аттракциона (тип BigDecimal)
     */
    public void addAttraction(String name, String workingTime, float cost) {
        attractions.add(new Attraction(name, workingTime, cost));
    }

    /**
     * Метод выводит информацию обо всех аттракционах парка.
     */
    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            attraction.displayInfo();
            System.out.println("--------------------------------------");
        }
    }
}