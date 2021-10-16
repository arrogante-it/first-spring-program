package com.proofyourself.springProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringTest {
    public static void main(String[] args) throws IOException {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       Computer computer = context.getBean("computer", Computer.class);
       computer.getMusic();

       context.close();

    }
}
