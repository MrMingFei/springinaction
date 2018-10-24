package com.myapp.config;

import com.myapp.desserts.Dessert;
import com.myapp.desserts.IceCream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = com.myapp.desserts.Dessert.class)
public class DessertConfig {

    @Bean(name = "iceCream")
    public Dessert iceCream(){
        return new IceCream();
    }
}
