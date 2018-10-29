package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    //构造器注入
//    @Autowired
//    public CDPlayer(BlankDisc cd){
//        this.cd = cd;
//    }
    //属性注入
    @Autowired
    //有多个CompactDisc会有异常提示，使用@Primary可以解决，但不用也不影响结果，因为在CDPlayerConfig中只声明了一个
    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
