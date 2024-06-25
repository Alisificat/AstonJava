package lesson6;

/**
 * Класс Main содержит метод main для демонстрации работы с классом Employee.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];

        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Employee("Chekmarev Igor", "Manager", "chekmarev@mailbox.com", "892355512", 40000, 35);
        persArray[2] = new Employee("Costolarov Alex", "Developer", "costolarov@mailbox.com", "892378912", 35000, 28);
        persArray[3] = new Employee("Magomedov Kuzma", "Designer", "magom@mailbox.com", "892355522", 32000, 32);
        persArray[4] = new Employee("Kozlov Sergey", "Analyst", "sergey@mailbox.com", "892355532", 38000, 31);

        for (Employee employee : persArray) {
            employee.displayInfo();
            System.out.println("--------------------------------------");

        }

        Park park = new Park("Wonderland Park");
        park.addAttraction("Ferris Wheel", "10:00 AM - 8:00 PM", 15);
        park.addAttraction("Roller Coaster", "12:00 PM - 10:00 PM", 25);

        System.out.println(" Список аттракционов ");
        park.displayAttractions();
    }
}

