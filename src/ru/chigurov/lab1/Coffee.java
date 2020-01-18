package ru.chigurov.lab1;

import java.util.UUID;

public class Coffee extends Product implements BaseClassFields {
    String kindOfCoffeeBeans;

    public Coffee() {
        id = UUID.randomUUID();
    }

    @Override
    public void create() {
        name = random_name_coffee[(int) (Math.random() * 4)];
        price = (int) (Math.random() * 1000);
        productCounter++;
        firm = random_firm_coffee[(int) (Math.random() * 3)];
        country = random_country_coffee[(int) (Math.random() * 5)];
        kindOfCoffeeBeans = random_kindOfCoffeeBeans_coffee[(int) (Math.random() * 2)];
    }

    @Override
    public void read() {
        System.out.println("Id товара - " + id + "\n" +
                "Название - " + name + "\n" +
                "Цена - " + price + "\n" +
                "Кол-во товара - " + productCounter + "\n" +
                "Фирма поставщик - " + firm + "\n" +
                "Страна производитель - " + country + "\n" +
                "Вид упаковки - " + kindOfCoffeeBeans + "\n");
    }
}
