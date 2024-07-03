package Lesson9;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("---------Задача 1--------- \n");
        String[] words = {"дом", "дверь", "окно", "дверь", "стул", "стул",
                "книга", "рука", "нос", "глаз", "дом", "рука", "стул"};
        WordUnic wordCounter = new WordUnic(words);

        // Задача 2
        System.out.println("\n---------Задача 2---------\n");
        BookPhone contact = new BookPhone();
        contact.add("Давыдов", "123456789");
        contact.add("Лукумов", "987654321");
        contact.add("Давыдов", "555666777");
        contact.add("Давыдов", "555666777");

        System.out.println("Номера Давыдов: " + contact.get("Давыдов"));
        System.out.println("Номера Лукумов: " + contact.get("Лукумов"));
        System.out.println("Номера Тухумов: " + contact.get("Тухумов"));

    }
}




