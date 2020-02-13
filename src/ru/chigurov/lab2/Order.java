package ru.chigurov.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    String[] orderStatus = {"в ожидании", "обработан"};
    Date timeCreate;
    //String timeWaiting = new SimpleDateFormat("HH:mm:ss; dd-MM-yyyy").format(new Date());;
    long timeWaiting;
    //long timeWaiting = 2000;

    public Order(){
        //String date = new SimpleDateFormat("HH:mm:ss, dd-MM-yyyy").format(new Date());
        this.timeCreate = new Date(System.currentTimeMillis());
    }
}
