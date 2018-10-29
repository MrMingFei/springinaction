package com.springinaction.config;

import com.springinaction.soundsystem.BlankDisc;
import com.springinaction.soundsystem.CDPlayer;
import com.springinaction.soundsystem.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:app.properties")//声明属性源
public class ExpressiveConfig {

    @Autowired
    Environment env;

//    @Bean
//    public BlankDisc disc(){
//        return new BlankDisc(
//                env.getProperty("disc.title"),
//                env.getProperty("disc.artist")
//        );
//    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer();
    }
}
