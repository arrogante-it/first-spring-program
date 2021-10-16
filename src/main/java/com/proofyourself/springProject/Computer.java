package com.proofyourself.springProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(@Qualifier("musicPlayer") MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public void getMusic() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String genre = bufferedReader.readLine();
        System.out.print("Computer " + id + " \n");
        if("classical".equals(genre)){
            musicPlayer.playMusic(Genre.CLASSICAL);
        }else if("rock".equals(genre)){
            musicPlayer.playMusic(Genre.ROCK);
        }else if("jazz".equals(genre)){
            musicPlayer.playMusic(Genre.JAZZ);
        }else{
            System.out.println("нет такого жанра, программа завершилась.");
        }
    }
}
