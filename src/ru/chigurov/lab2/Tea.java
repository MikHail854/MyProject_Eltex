package ru.chigurov.lab2;

import java.util.UUID;

public class Tea extends Product implements BaseClassFields {
    String typeOfPackaging;

    public Tea() {
        id = UUID.randomUUID();
    }

    @Override
    public void create() {
        name = random_name_tea[(int) (Math.random() * 3)];
        price = (int) (Math.random() * 1000);
        productCounter++;
        firm = random_firm_tea[(int) (Math.random() * 3)];
        country = random_country_tea[(int) (Math.random() * 5)];
        typeOfPackaging = random_typeOfPackaging_tea[(int) (Math.random() * 2)];
    }

    @Override
    public void read() {
        System.out.println("Id товара - " + id + "\n" +
                "Название - " + name + "\n" +
                "Цена - " + price + "\n" +
                "Кол-во товара - " + productCounter + "\n" +
                "Фирма поставщик - " + firm + "\n" +
                "Страна производитель - " + country + "\n" +
                "Вид упаковки - " + typeOfPackaging + "\n");
    }
}
