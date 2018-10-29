package com.concert.test;

import com.concert.config.ConcertConfig;
import com.concert.perform.MusicPerform;
import com.concert.perform.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class PerformTest {

    @Autowired
    private Performance performance;

    @Test
    public void perform(){
        performance.perform();
    }
}
