package com.proofyourself.springProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("jazzMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void playMusic(Genre genre){
        if(genre.equals(Genre.CLASSICAL)){
            music1.getSong();
        }
        if(genre.equals(Genre.ROCK)){
            music2.getSong();
        }
        if(genre.equals(Genre.JAZZ)){
            music3.getSong();
        }
    }
}
