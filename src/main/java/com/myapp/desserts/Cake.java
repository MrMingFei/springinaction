package com.myapp.desserts;

import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert {
    public void eat() {
        System.out.println("Eat Cake");
    }
}
