package com.myapp.test;

import com.myapp.config.DessertConfig;
import com.myapp.desserts.BuyDessert;
import com.myapp.desserts.Dessert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class BuyDessertTest {

    @Autowired
    private BuyDessert buyDessert;

    @Test
    public void eat(){
        buyDessert.eat();
    }
}
