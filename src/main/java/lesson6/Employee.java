package lesson6;

import java.math.BigDecimal;

/**
 * Класс Employee представляет сотрудника компании.
 */
public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    /**
     * Конструктор класса Employee, инициализирует поля сотрудника.
     *
     * @param fio         ФИО сотрудника
     * @param position    Должность сотрудника
     * @param email       Email сотрудника
     * @param phoneNumber Номер телефона сотрудника
     * @param salary      Зарплата сотрудника
     * @param age         Возраст сотрудника
     */
    public Employee(String fio, String position, String email, String phoneNumber, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Метод displayInfo выводит информацию о сотруднике в консоль.
     */
    public void displayInfo() {
        System.out.println("Full Name: " + fio);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
