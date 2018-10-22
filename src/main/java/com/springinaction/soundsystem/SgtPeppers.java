package com.springinaction.soundsystem;

import org.springframework.stereotype.Component;

@Component//使用@Component("lonelyHeartClub")来为bean命名，或者默认类名
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band ";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
