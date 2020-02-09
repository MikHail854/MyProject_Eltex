package ru.chigurov.lab2;

import java.util.UUID;

public abstract class Product extends ShoppingCart implements ICrudAction {

    public UUID id; //ID товара
    public String name; //название
    int price; //цена
    int productCounter = 0; //счетчик товара
    String firm; //фирма поставщик
    String country; //страна производитель



    @Override
    public void delete() {
        if (shoppingCart.size() == 0) {
            System.out.println("Корзина пуста\n");
        } else {
                for (int i = 0; i < 7; i++) {
                shoppingCart.remove(0);
            }
            productCounter--;
        }
    }
}
