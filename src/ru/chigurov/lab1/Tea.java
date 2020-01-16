package ru.chigurov.lab1;

import java.util.UUID;

public class Tea extends Product {
   String typeOfPackaging;

   public Tea(){
   }

   @Override
   public void create() {
      id = UUID.randomUUID();
      name = "NAME_RANDOM";
      price = 10;
      productCounter++;
      firm = "FIRM_RANDOM";
      country = "COUNTRY_RANDOM";
      typeOfPackaging = "typeOfPackaging_RANDOM";
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
