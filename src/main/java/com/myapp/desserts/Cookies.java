package com.myapp.desserts;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cookies implements Dessert {
    public void eat() {
        System.out.println("Eat Cookies");
    }
}
