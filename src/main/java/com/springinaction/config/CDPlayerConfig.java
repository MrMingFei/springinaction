package com.springinaction.config;

import com.springinaction.soundsystem.BlankDisc;
import com.springinaction.soundsystem.CDPlayer;
import com.springinaction.soundsystem.CompactDisc;
import com.springinaction.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages = "com.springinaction.soundsystem")//指定扫描的包
//@ComponentScan(basePackageClasses = CompactDisc.class)//使用String类型有时候不安全
public class CDPlayerConfig {
    //在上面将自动扫描注释掉，下面使用显式配置
    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer();
    }
}
