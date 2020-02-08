package ru.chigurov.lab2;

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
        Main selection = new Main();
        if (args[0].equalsIgnoreCase("tea")) {
            Tea tea = new Tea();
            selection.menu();
            Scanner scanner = new Scanner(System.in);
            int menuSelection = scanner.nextInt();
            while (menuSelection != 5) {
                if (menuSelection == 1) {
                    tea.create();
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
        }
        if (args[0].equalsIgnoreCase("coffee")) {
            Coffee coffee = new Coffee();
            selection.menu();
            Scanner scanner = new Scanner(System.in);
            int menuSelection = scanner.nextInt();
            while (menuSelection != 5) {
                if (menuSelection == 1) {
                    coffee.create();
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
        /*Tea tea = new Tea();
        Credentials user = new Credentials();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addPRODUCT(tea);*/
    }
}
