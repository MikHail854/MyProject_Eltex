package ru.chigurov.lab2;

import jdk.nashorn.internal.ir.WhileNode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    /**
     * программа работает от аргумента, в зависимости от вида представления(чай или кофе)
     */
    public void menu() {
        System.out.println("Выберите действие:\n" +
                "1. Создание объекта\n" +
                "2. Вывод объекта на экран\n" +
                "3. Ввод данных с клавиатуры\n" +
                "4. Принудительное зануление данных\n" +
                "5. Оформление заказа\n" +
                "6. Вывод информации о заказе на экран\n" +
                "7. Выход\n");
    }

    public static void main(String[] args) {

        /**
         * тестовое создание и отображение даты и верени
         */
        Date timeCreate = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH-mm-ss-SSS, dd - MM - yyy");
        // System.out.println(timeCreate);
        String date = new SimpleDateFormat("HH:mm:ss, dd-MM-yyyy").format(new Date());
        System.out.println(date);


        Main selection = new Main();
        System.out.println("Выберете что заказать: \n1. Чай\n2. Кофе");
        Scanner scanner = new Scanner(System.in);
        int teaORcoffee = scanner.nextInt();
        if (teaORcoffee == 1) {
            Tea tea = new Tea();
            selection.menu();
            int menuSelection = scanner.nextInt();
            Orders orders = new Orders();
            while (menuSelection != 7) {
                if (menuSelection == 1) {
                    tea.create();
                    /**
                     * проверка заполнения коллекции
                     */
                    System.out.println(tea.shoppingCart);
                }
                if (menuSelection == 2) {
                    tea.read();
                }
                if (menuSelection == 3) {
                    tea.update();
                }
                if (menuSelection == 4) {
                    tea.delete();
                }
                if (menuSelection == 5) {
                    orders.checkout(tea.shoppingCart);
                }
                if (menuSelection == 6) {
                    int i = 0;
                    while (i < orders.order.size()) {
                        System.out.println("Ваш id - " + orders.order.get(i) + "\n" +
                                "Фамилия - " + orders.order.get(i + 1) + "\n" +
                                "Имя - " + orders.order.get(i + 2) + "\n" +
                                "Отчество - " + orders.order.get(i + 3) + "\n" +
                                "Ваш e-mail - " + orders.order.get(i + 4) + "\n" +
                                "Id товара - " + orders.order.get(i + 5) + "\n" +
                                "Название - " + orders.order.get(i + 6) + "\n" +
                                "Цена - " + orders.order.get(i + 7) + "\n" +
                                "Фирма поставщик - " + orders.order.get(i + 8) + "\n" +
                                "Страна производитель - " + orders.order.get(i + 9) + "\n" +
                                "Вид упаковки - " + orders.order.get(i + 10) + "\n" +
                                "Кол-во товара в корзине- " + orders.order.get(i + 11) + "\n" +
                                "Время создания заказа - " + orders.order.get(i + 12) + "\n" +
                                "Статус заказа - " + "\n");
                        i = i + 13;
                    }
                }
                selection.menu();
                menuSelection = scanner.nextInt();
            }
        } else if (teaORcoffee == 2) {
            Coffee coffee = new Coffee();
            selection.menu();
            int menuSelection = scanner.nextInt();
            while (menuSelection != 7) {
                if (menuSelection == 1) {
                    coffee.create();
                    /**
                     * проверка заполнения коллекции
                     */
                    System.out.println(coffee.shoppingCart);
                }
                if (menuSelection == 2) {
                    coffee.read();
                }
                if (menuSelection == 3) {
                    coffee.update();
                }
                if (menuSelection == 4) {
                    coffee.delete();
                }
                selection.menu();
                menuSelection = scanner.nextInt();
            }
        }

        //Credentials user = new Credentials();

    }
}
