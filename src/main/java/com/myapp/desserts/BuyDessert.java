package com.myapp.desserts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BuyDessert {

    //同时存在两个以上的Dessert类时候，可以用@Primary设置优先级，有两个以上的@Primary时可以用@Qualifier限定
    @Autowired
    @Qualifier("iceCream")
    private Dessert dessert;

    public void eat(){
        dessert.eat();
    }
}
