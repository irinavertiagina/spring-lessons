package ru.vertiagina.lessonsBeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author irkin
 **/
@Component
@Scope("singleton")
public class Lion implements Animal {


    //ctor
    public Lion() {
    }

@Override
public String makeNoise() {
    return "I am a LION ";
}
    //init
    @PostConstruct
    public void doInit() {
        System.out.println("Initializing LION bean...");
    }

    //destroy
    @PreDestroy
    public void doDestroy() {
        System.out.println("Destroying LION bean...");
    }
}//class