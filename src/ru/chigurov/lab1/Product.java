package ru.chigurov.lab1;

import java.util.Scanner;
import java.util.UUID;

public abstract class Product implements ICrudAction{

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
        name = scanner.nextLine();
        System.out.println("Введите цену: ");
        price = scanner.nextInt();
        System.out.println("Введите фирму поставщика: ");
        firm = scanner.nextLine();
        System.out.println("Введите страну производителя: ");
        country = scanner.nextLine();
        productCounter++;

    }

    @Override
    public void delete() {
        name = "";
        price = 0;
        firm = "";
        country = "";
        productCounter--;
    }
}
