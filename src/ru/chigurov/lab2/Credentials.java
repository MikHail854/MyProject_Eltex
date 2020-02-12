package ru.chigurov.lab2;

import java.util.UUID;

public class Credentials {

    UUID idUser;
    String firstName;
    String lastName;
    String patronymic;
    String email;

    public Credentials(UUID idUser, String firstName, String lastName, String patronymic, String email){
        this.idUser = UUID.randomUUID();
        this.firstName = "Mikhail";
        this.lastName = "Chigurov";
        this.patronymic = "Evgen'evich";
        this.email = "vip.moneta95@mail.ru";
    }

}
