package Lesson9;

import java.util.*;


public class BookPhone {
    private Map<String, List<String>> contactLog = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (contactLog.containsKey(lastName)) {
            contactLog.get(lastName).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            contactLog.put(lastName, phoneNumbers);
        }
    }

    public List<String> get(String lastName) {
        return contactLog.getOrDefault(lastName, new ArrayList<>());
    }
}