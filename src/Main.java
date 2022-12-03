public class Main {
    public static void main(String[] args) {
        System.out.println("===================== ДЗ 5 =============================");
        System.out.println("------------------- Задание 1 --------------------------");

        int clientOS = 1;  // 0- iOS, 1- Android

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println();
        System.out.println("------------------- Задание 2 --------------------------");

        int clientDeviceYear = 2011;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else  System.out.println("Установите приложение по ссылке");

        System.out.println();
        System.out.println("------------------- Задание 3 --------------------------");

        int year = 2020;
        boolean leapYear = ((year % 4 == 0) && (year % 100!=0))|| (year % 400 == 0);

        if (leapYear) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        System.out.println("------------------- Задание 4 --------------------------");

        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance <20) {
            System.out.println("Доставка в течении суток");
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: "+(deliveryDay+1) );
        } else if (deliveryDistance >=60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDay + 2));
        }

        System.out.println();
        System.out.println("------------------- Задание 5 --------------------------");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Время года - зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года - весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года - лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года - осень.");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }

    }
}