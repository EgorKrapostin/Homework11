import java.time.LocalDate;

public class Main {

    /**
     * Реализуйте метод, который получает в качестве параметра год,проверяет, является ли он високосным, и выводит результат в консоль.
     */
    public static void isLeapYear(int num) {
        System.out.println("Задача 1");
        if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) {
            System.out.println(num + " год — високосный год");
        } else {
            System.out.println(num + " год — невисокосный год");
        }
    }

    /**
     * Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
     * Если устройство старше текущего года, предложите ему установить облегченную версию.
     * В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
     */

    public static void osVersion(int num) {
        System.out.println("Задача 2");
        int clientDeviceYear = 2021;
        int currentYear = LocalDate.now().getYear();
        if (num == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    /**
     * В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
     * Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
     */
    public static int daysToDeliver(int num) {
        int days = 0;
        if (num < 20) {
            days += 1;
        } else if (num >= 20 && num <= 60) {
            days += 2;
        } else if (num >= 60 && num <= 100) {
            days += 3;
        } else {
            System.out.println("Доставки нет");
        }

        return days;
    }

    public static void main(String[] args) {
        int deliveryDistance = 95;
        int year = 2022;
        int osType = 1;
        int deliveryTime = daysToDeliver(deliveryDistance);
        isLeapYear(year);
        osVersion(osType);
        System.out.println("Задача 3");
        System.out.println("Доставка займет " + deliveryTime + " дня");
    }
}