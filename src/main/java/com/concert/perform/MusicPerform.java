package com.concert.perform;

import org.springframework.stereotype.Component;

@Component
public class MusicPerform implements Performance {

    public void perform() {
        System.out.println("开始表演");
    }
}
