package com.springinaction.test;

import com.springinaction.config.CDPlayerConfig;
import com.springinaction.config.ExpressiveConfig;
import com.springinaction.soundsystem.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = CDPlayerConfig.class)//jappava文件配置
//@ContextConfiguration(classes = ExpressiveConfig.class)//java文件配置，传参数使用了app.properties
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")//xml文件配置
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Test
    public void play(){
        player.play();
        //Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n", log.getLog());
    }
}
