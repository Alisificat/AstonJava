package Lesson9;

import java.util.HashMap;
import java.util.Map;

public class WordUnic {

    public WordUnic(String[] words) {

        Map<String, Integer> wordCountMap = new HashMap<>();

          // Подсчет повторений слов
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и их количество повторений
        System.out.println("Уникальные слова и их количество повторений:");
         wordCountMap.forEach((key, value) -> {
            System.out.print("[" + key + ": " + value + "] ");
        });
    }
}
