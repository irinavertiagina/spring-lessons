package ru.vertiagina.lessonsBeans;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author irkin
 **/

//@AllArgsConstructor
//@Data
//@NoArgsConstructor
 public class Cat {
     String name;

     private Part part;


     //ctor
    public Cat(){}

    public Cat(Part part){
     this.part = part;
    }

    public void introduce() {
        System.out.println("I have "+ part.getPart());
    }
}//cat

