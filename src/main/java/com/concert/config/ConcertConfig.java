package com.concert.config;

import com.concert.aspect.Audience;
import com.concert.aspect.AudienceIn;
import com.concert.perform.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackageClasses = Performance.class)
@EnableAspectJAutoProxy
public class ConcertConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public AudienceIn audienceIn(){
        return new AudienceIn();
    }
}
