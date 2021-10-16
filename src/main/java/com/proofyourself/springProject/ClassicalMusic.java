package com.proofyourself.springProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private List<String> classicals;

    private String song1 = "Rhapsody";
    private String song2 = "Opera1";
    private String song3 = "Greg's song2";

    @Override
    public void getSong() {
        classicals = new ArrayList<>();
        classicals.add(song1);
        classicals.add(song2);
        classicals.add(song3);
        Random random = new Random();
        int c = 0;
        for(int i = 0; i < classicals.size(); i++){
            int ran = random.nextInt(classicals.size());
            System.out.println("Playing: " + classicals.get(ran));
            c++;
            if(c == 1){
                break;
            }
        }
    }
}
