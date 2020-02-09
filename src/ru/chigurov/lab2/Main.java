package ru.chigurov.lab2;

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
                "5. Выход\n");
    }

    public static void main(String[] args) {

        /**
         * тестовое создание и отображение даты и верени
         */
        //Date timeCreate = new Date();
        SimpleDateFormat time = new SimpleDateFormat("HH-mm-ss-SSS, dd - MM - yyy");
        //System.out.println(timeCreate.toString());


        Main selection = new Main();
        System.out.println("Выберете что заказать: \n1. Чай\n2. Кофе");
        Scanner scanner = new Scanner(System.in);
        int teaORcoffee = scanner.nextInt();
        if (teaORcoffee == 1) {
            Tea tea = new Tea();
            selection.menu();
            int menuSelection = scanner.nextInt();
            while (menuSelection != 5) {
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
                selection.menu();
                menuSelection = scanner.nextInt();
            }
        } else if (teaORcoffee == 2) {
            Coffee coffee = new Coffee();
            selection.menu();
            int menuSelection = scanner.nextInt();
            while (menuSelection != 5) {
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
