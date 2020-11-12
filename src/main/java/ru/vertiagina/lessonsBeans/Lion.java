package ru.vertiagina.lessonsBeans;

import org.springframework.stereotype.Component;

/**
 * Author irkin
 **/
@Component
public class Lion implements Animal {


    //ctor
    public Lion() {
    }

@Override
public String makeNoise() {
    return "I am a LION ";
}
    //init
    public void doInit() {
        System.out.println("Initializing LION bean...");
    }

    //destroy
    public void doDestroy() {
        System.out.println("Destroying LION bean...");
    }
}//class