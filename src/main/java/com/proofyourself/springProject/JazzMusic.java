package com.proofyourself.springProject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class JazzMusic implements Music{
    private List<String> jazz;

    private String song1 = "jazz song1";
    private String song2 = "jazz song2";
    private String song3 = "jazz song3";

    @Override
    public void getSong() {
        jazz = new ArrayList<>();
        jazz.add(song1);
        jazz.add(song2);
        jazz.add(song3);
        Random random = new Random();
        int counter = 0;
        for(int i = 0; i < jazz.size(); i++){
            int ran = random.nextInt(jazz.size());
            System.out.println("Playing: " + jazz.get(ran));
            counter++;
            if(counter == 1){
                break;
            }
        }
    }
}
