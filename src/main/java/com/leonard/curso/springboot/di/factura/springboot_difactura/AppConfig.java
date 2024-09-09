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
    List<Item> intemsInvoice(){
        Product p1 = new Product("camara sony", 200.0);
        Product p2 = new Product("bicicleta", 500.0);
        
        return Arrays.asList(new Item(p1, 2), new Item(p2, 4));
    }

}
