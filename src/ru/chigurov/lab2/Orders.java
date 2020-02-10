package ru.chigurov.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Orders {

    List<Object> order = new LinkedList<>();
    private Credentials user = new Credentials();
    private Order time = new Order();

    public void checkout(List finalOrder) {
        order.add(user.idUser);
        order.add(user.lastName);
        order.add(user.firstName);
        order.add(user.patronymic);
        order.add(user.email);
        order.addAll(finalOrder);
        order.add(time.timeCreate);

        time.timeWaiting = new SimpleDateFormat("HH:mm:ss; dd-MM-yyyy").format(new Date());
        if (time.timeCreate - time.timeWaiting < 20l){
            order.add(time.orderStatus[0]);
        }else {
            order.add(time.orderStatus[1]);
        }
        System.out.println(order);
        System.out.println(order.get(order.size() - 1));
    }

}
