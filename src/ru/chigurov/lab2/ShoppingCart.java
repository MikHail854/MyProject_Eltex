package ru.chigurov.lab2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> order = new ArrayList<>();

    public ShoppingCart() {

    }

    public void addPRODUCT(Product product){
        order.add(product);
    }



}
