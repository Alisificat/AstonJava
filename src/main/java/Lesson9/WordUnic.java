package Lesson9;

import java.util.HashMap;
import java.util.Map;

public class WordUnic {
    Map<String, Integer> countMap = new HashMap<>();

    public WordUnic(String[] words) {

        // Подсчитываем количество повторений каждого слова
        for (String word : words) {
            // Если слово уже присутствует в Map, увеличиваем количество повторений на 1
            if (countMap.containsKey(word)) {
                int count = countMap.get(word);
                countMap.put(word, count + 1);
            } else {
                // Если слово встречается впервые, добавляем его в Map с количеством 1
                countMap.put(word, 1);
            }
        }

        // Выводим уникальные слова и их количество повторений
        System.out.println("Уникальные слова и их количество повторений:");
        countMap.forEach((key, value) -> {
            System.out.print("[" + key + ": " + value + "] ");
        });
    }
}
