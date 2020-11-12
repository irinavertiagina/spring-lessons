package ru.vertiagina.lessonsBeans;

import java.util.ArrayList;
import java.util.List;

/**
 * Author irkin
 **/
public class Zoo {
    List <Animal> zoo = new ArrayList<>();
    Animal animal;

    public Zoo() {
    }

    public Zoo(Animal animal){ this.animal = animal;}

    public Zoo(List<Animal> zoo) {
        this.zoo = zoo;
    }


    public List<Animal> getZoo() {
        return zoo;
    }

    public void setZoo(List<Animal> zoo) {
        this.zoo = zoo;
    }


    public void showAnimal(){
        System.out.println(animal.makeNoise());
    }

    public void showAllAnimals(){
        for(int i = 0; i<zoo.size();i++){
            System.out.println(zoo.get(i).makeNoise());
        }

     }

}
