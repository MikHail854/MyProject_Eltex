package ru.chigurov.lab2;

import java.util.Scanner;
import java.util.UUID;

public class Coffee extends Product implements BaseClassFields {
    String kindOfCoffeeBeans;

    public Coffee() {
    }

    @Override
    public void create() {
        shoppingCart.add(id = UUID.randomUUID());
        shoppingCart.add(name = random_name_coffee[(int) (Math.random() * 4)]);
        shoppingCart.add(price = (int) (Math.random() * 1000));
        shoppingCart.add(firm = random_firm_coffee[(int) (Math.random() * 3)]);
        shoppingCart.add(country = random_country_coffee[(int) (Math.random() * 5)]);
        shoppingCart.add(kindOfCoffeeBeans = random_kindOfCoffeeBeans_coffee[(int) (Math.random() * 2)]);
        shoppingCart.add(++productCounter);
    }

    @Override
    public void read() {
        if (shoppingCart.size() == 0) {
            System.out.println("Корзина пуста\n");
        } else {
            int i = 0;
            while (i < shoppingCart.size()) {
                System.out.println("Id товара - " + shoppingCart.get(i) + "\n" +
                        "Название - " + shoppingCart.get(i + 1) + "\n" +
                        "Цена - " + shoppingCart.get(i + 2) + "\n" +
                        "Фирма поставщик - " + shoppingCart.get(i + 3) + "\n" +
                        "Страна производитель - " + shoppingCart.get(i + 4) + "\n" +
                        "Вид кофейных зерен - " + shoppingCart.get(i + 5) + "\n" +
                        "Кол-во товара - " + shoppingCart.get(i + 6) + "\n");
                i = i + 7;
            }
        }
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        shoppingCart.add(id = UUID.randomUUID());
        System.out.println("Введите название: ");
        shoppingCart.add(name = scanner.nextLine());
        System.out.println("Введите цену: ");
        shoppingCart.add(price = scanner.nextInt());
        System.out.println("Введите фирму поставщика: ");
        shoppingCart.add(firm = scanner.nextLine());
        System.out.println("Введите страну производителя: ");
        shoppingCart.add(country = scanner.nextLine());
        System.out.println("Введите вид кофейных зерен: ");
        shoppingCart.add(kindOfCoffeeBeans = scanner.nextLine());
        shoppingCart.add(++productCounter);
    }
}
