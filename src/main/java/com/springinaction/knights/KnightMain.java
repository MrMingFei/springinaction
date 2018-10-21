package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain{

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:spring/applicationContext.xml");
        BraveKnight knight = context.getBean(BraveKnight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
