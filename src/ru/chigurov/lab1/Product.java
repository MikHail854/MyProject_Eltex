package ru.chigurov.lab1;

import java.util.UUID;

public abstract class Product implements ICrudAction{

    public UUID id; //ID товара
    public String name; //название
    int price; //цена
    int productCounter; //счетчик товара
    String firm; //фирма поставщик
    String country; //страна производитель



    @Override
    public void read() {

    }

    @Override
    public void create() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
