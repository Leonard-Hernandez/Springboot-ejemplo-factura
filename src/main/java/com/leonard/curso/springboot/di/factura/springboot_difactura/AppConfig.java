package com.leonard.curso.springboot.di.factura.springboot_difactura;

import java.util.List;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.leonard.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.leonard.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        Product p1 = new Product("camara sony", 200.0);
        Product p2 = new Product("bicicleta", 500.0);

        return Arrays.asList(new Item(p1, 2), new Item(p2, 4));
    }

    @Bean("default")
    List<Item> itemsInvoiceOffice() {
        Product p1 = new Product("Pisa papeles", 20.0);
        Product p2 = new Product("Impresora hp", 800.0);
        Product p3 = new Product("Laptop hp", 1500.0);
        Product p4 = new Product("Laptop dell", 2000.0);

        return Arrays.asList(new Item(p1, 3), new Item(p2, 5),
                new Item(p3, 1), new Item(p4, 2));
    }
}
