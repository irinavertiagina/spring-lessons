package ru.vertiagina.lessonsBeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author irkin
 **/
@Component
public class Tiger implements Animal {

@Value("${Animal.name}")
    String name ;
@Value("${Animal.age}")
    int age;

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
