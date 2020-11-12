package ru.vertiagina.lessonsBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Author irkin
 **/
@Component
public class Zoo {

    Animal animal;
 
    public Zoo() {}

    @Autowired
    public Zoo(Animal animal ){
        this.animal = animal;
    }



    public void showAnimal(){
        System.out.println(animal.makeNoise() );
    }



     }//class

