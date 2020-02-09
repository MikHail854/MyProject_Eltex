package ru.chigurov.lab2;

import java.util.UUID;

public class Tea extends Product implements BaseClassFields {
    String typeOfPackaging;

    public Tea() {
    }

    @Override
    public void create() {
        order.add(id = UUID.randomUUID());
        order.add(name = random_name_tea[(int) (Math.random() * 3)]);
        order.add(price = (int) (Math.random() * 1000));
        order.add(firm = random_firm_tea[(int) (Math.random() * 3)]);
        order.add(country = random_country_tea[(int) (Math.random() * 5)]);
        order.add(typeOfPackaging = random_typeOfPackaging_tea[(int) (Math.random() * 2)]);
        order.add(++productCounter);
    }

    @Override
    public void read() {
        if (order.size() == 0) {
            System.out.println("Корзина пуста\n");
        } else {
            int i = 0;
            while (i < order.size()) {
                System.out.println("Id товара - " + order.get(i) + "\n" +
                        "Название - " + order.get(i + 1) + "\n" +
                        "Цена - " + order.get(i + 2) + "\n" +
                        "Фирма поставщик - " + order.get(i + 3) + "\n" +
                        "Страна производитель - " + order.get(i + 4) + "\n" +
                        "Вид упаковки - " + order.get(i + 5) + "\n" +
                        "Кол-во товара в корзине- " + order.get(i + 6) + "\n");
                i = i + 7;
            }
        }
    }
}
