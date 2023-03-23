public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance <= 20) {
            System.out.println("Доставка дней" + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка дней:" + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка дней:" + (deliveryDays + 1 + 1));
        }
            return deliveryDays;
        }

        public static int checkOperationSystem ( int clientOS, int clientDeviceYear){
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            return clientOS;
        }



        public static void checkTypeYear ( int year){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является вискокосным");

            }
        }

        public static void task1 () {
            System.out.println("Задача 1");
            int year = 2020;
            checkTypeYear(year);
            System.out.println();
        }



        public static void task2 () {
            System.out.println("Задача 2");
            int clientOS = 1;
            int clientDeviceYear = 2000;
            checkOperationSystem(clientOS, clientDeviceYear);
            System.out.println();
        }

        public static void task3 () {
            System.out.println("Задача 3");
            int deliveryDistance = 80;
            calculateDeliveryDays(deliveryDistance);
        }
    }
