package ru.chigurov.lab2;

import java.util.UUID;

public class Credentials {

    UUID idUser;
    String firstName;
    String lastName;
    String patronymic;
    String email;

    public Credentials(){
        idUser = UUID.randomUUID();
        firstName = "Mikhail";
        lastName = "Chigurov";
        patronymic = "Evgen'evich";
        email = "vip.moneta95@mail.ru";
    }

}
