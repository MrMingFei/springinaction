package com.springinaction.config;

import com.springinaction.soundsystem.CompactDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springinaction.soundsystem")//指定扫描的包
//@ComponentScan(basePackageClasses = CompactDisc.class)//使用String类型有时候不安全
public class CDPlayerConfig {
}
