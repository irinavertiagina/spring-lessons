package ru.vertiagina.lessonsBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Author irkin
 **/
@Component
public class Zoo {


    Animal animal;
    Animal animal2;

    public Zoo() {}

    @Autowired

    //@Qualifier annotation to solve NEODNOZNACHNOST
    public Zoo(@Qualifier("lion") Animal animal,  @Qualifier("tiger") Animal animal2 )
    {
        this.animal = animal;
        this.animal2 = animal2;
    }



    public void showAnimal(){
        System.out.println(animal.makeNoise() );
    }
    public void showAllAnimals(){
        System.out.println(animal.makeNoise() + animal2.makeNoise() );
    }



     }//class

