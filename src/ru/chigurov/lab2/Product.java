package ru.chigurov.lab2;

import java.util.Scanner;
import java.util.UUID;

public abstract class Product extends ShoppingCart implements ICrudAction {

    public UUID id; //ID товара
    public String name; //название
    int price; //цена
    int productCounter = 0; //счетчик товара
    String firm; //фирма поставщик
    String country; //страна производитель

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        id = UUID.randomUUID();
        System.out.println("Введите название: ");
        order.add(name = scanner.nextLine());
        System.out.println("Введите цену: ");
        order.add(price = scanner.nextInt());
        System.out.println("Введите фирму поставщика: ");
        order.add(firm = scanner.nextLine());
        System.out.println("Введите страну производителя: ");
        order.add(country = scanner.nextLine());
        order.add(++productCounter);

    }

    @Override
    public void delete() {
        if (order.size() == 0) {
            System.out.println("Корзина пуста\n");
        } else {
            for (int i = 0; i < 7; i++) {
                order.remove(0);
            }
            productCounter--;
        }
    }
}
