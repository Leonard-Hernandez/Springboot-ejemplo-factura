package com.leonard.curso.springboot.di.factura.springboot_difactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Invoice {

    @Autowired
    private Client client;

    @Value("${invoice.description.office}")
    private String description;

    @Autowired
    @Qualifier("default")
    private List<Item> items;

    @PostConstruct
    public void init(){
        //post constructor a diferencia de el construtor cuando este se ejecuta 
        //ya se han inyectado las dependencias
        System.out.println("creando el componente de la consulta");
        client.setName(client.getName().concat(" David"));
        System.out.println(client);
        description = description.concat(" del cliente ").concat(client.getName()).concat(" " + client.getLastName());
        System.out.println(description);
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destruyendo el componente de invoice!!");
    }

    public Invoice() {
    }

    public Invoice(Client client, String description, List<Item> items) {
        this.client = client;
        this.description = description;
        this.items = items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        return items.stream().mapToInt(Item::getImporte).sum();
    }

}
