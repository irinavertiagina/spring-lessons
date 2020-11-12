package ru.vertiagina.lessonsBeans;

/**
 * Author irkin
 **/
public class Cage {

    Animal animal;

    public Cage(Animal animal) {
        this.animal = animal;
    }

    public void open(){
        System.out.println(animal.makeNoise());
    }
}
