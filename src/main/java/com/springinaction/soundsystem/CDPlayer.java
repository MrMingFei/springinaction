package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private BlankDisc cd;

    //构造器注入
//    @Autowired
//    public CDPlayer(BlankDisc cd){
//        this.cd = cd;
//    }
    //属性注入
    @Autowired
    public void setCompactDisc(BlankDisc cd){
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
