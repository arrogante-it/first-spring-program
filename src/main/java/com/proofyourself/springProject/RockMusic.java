package com.proofyourself.springProject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private List<String> rock;

    private String song1 = "thunder";
    private String song2 = "wild cries mary";
    private String song3 = "bones";

    @Override
    public void getSong() {
        rock = new ArrayList<>();
        rock.add(song1);
        rock.add(song2);
        rock.add(song3);
        Random random = new Random();
        int c = 0;
        for(int i = 0; i < rock.size(); i++){
            int ran = random.nextInt(rock.size());
            System.out.println("Playing: " + rock.get(ran));
            c++;
            if(c == 1){
                break;
            }
        }
    }
}
