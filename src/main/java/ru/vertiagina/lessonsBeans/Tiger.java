package ru.vertiagina.lessonsBeans;

import org.springframework.stereotype.Component;

/**
 * Author irkin
 **/
@Component
public class Tiger implements Animal {



    //ctors
    private Tiger() {
    }

    //factory method
    public static Tiger factory(){
      return new Tiger();
    }

    @Override
    public String makeNoise() {
        return "I am a TIGER " ;
    }

    //init
    public void doInit(){
        System.out.println("Initializing TIGER bean...");
    }
    //destroy
    public void doDestroy(){
        System.out.println("Destroying TIGER bean...");
    }

}
