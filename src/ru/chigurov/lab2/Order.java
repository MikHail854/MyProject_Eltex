package ru.chigurov.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    String[] orderStatus = {"в ожидании", "обработан"};
    String timeCreate = new SimpleDateFormat("HH:mm:ss; dd-MM-yyyy").format(new Date());
    //String timeWaiting = new SimpleDateFormat("HH:mm:ss; dd-MM-yyyy").format(new Date());;
    String timeWaiting;
    //long timeWaiting = 2000;

    public Order(){
        String date = new SimpleDateFormat("HH:mm:ss, dd-MM-yyyy").format(new Date());
    }
}
