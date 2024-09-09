package com.leonard.curso.springboot.di.factura.springboot_difactura.models;

import org.springframework.stereotype.Component;

@Component
public class Client {

    private String name;
    private String LastName;

    private Client() {
    }

    public Client(String name, String lastName) {
        this.name = name;
        LastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

}
