import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYear(2024);

        checkOS(0, 2023);
        checkOS(1, 2025);
        delivery(100);
    }

    public static void leapYear(int year) {
        //Task1
        System.out.println("Задание №1");
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    public static void checkOS(int os, int clientDeviceYear) {
        System.out.println("Задача №2");
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
          if (clientDeviceYear > currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        } else if (os == 1) {
            if (clientDeviceYear > currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void delivery (int deliveryDistance) {
        System.out.println("Задание №3");
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
}