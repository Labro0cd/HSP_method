import java.time.LocalDate;

public class Main {
    public static String checkYear (int year) {
        if (year%4==0&&(year%400==0||year%100!=0)) {
            return year + " год являеться весокосным";
        }
        return year + " год не являеться весокосным";

    }

    public static String checkVersion(int clientOS, int clientDeviceYear) {
        if(clientOS==0){
            if(clientDeviceYear>=LocalDate.now().getYear()) {
                return "Установите версию для IOS по ссылке.";
            }else {
                return "Установите облгеченную версию приложения для IOS по ссылке.";
            }
        }else if (clientDeviceYear>=LocalDate.now().getYear()){
            return "Установите версию для Android по ссылке.";
        }else {
            return "Установите обглеченную версию приложения для Android по ссылке.";
        }
    }

    public static String calculationDistance(int deliveryDistance) {
        if (deliveryDistance<=20){
            return "Потребуется дней: 1";
        }else if (deliveryDistance<=60){
            return "Потребуется дней: 2";
        }else if (deliveryDistance<=100){
            return "Потребуется дней: 3";
        }else {
            return "Доставки нет";
        }
    }

    public static void main(String[] args) {

        // Задача 1
        int year = 2024;
        System.out.println(checkYear(year));
        // Задача 2
        int clientOS = 0;
        int clientDeviceYear = 2024;
        System.out.println(checkVersion(clientOS,clientDeviceYear));
        // Задача 3
        int deliveryDistance = 95;
        System.out.println(calculationDistance(deliveryDistance));

    }
}