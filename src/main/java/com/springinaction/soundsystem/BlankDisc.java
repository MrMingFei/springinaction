package com.springinaction.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist){
        this.artist = artist;
        this.title = title;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
