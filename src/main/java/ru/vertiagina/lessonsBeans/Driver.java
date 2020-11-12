package ru.vertiagina.lessonsBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author irkin
 **/
public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

////1 example
//       Part part = context.getBean("higga_BEAN", Part.class);
//       Cat higg = new Cat(part);
//       higg.introduce();


// 2 example
        //Animal myAnimal = context.getBean("animal_BEAN", Lion.class);
       // Cage cage = new Cage(myAnimal);

       // Cage cage = context.getBean("cage_BEAN", Cage.class);
        //cage.open();


        //////3 example witj zoo
        Zoo zoo = context.getBean("zoo_BEAN", Zoo.class);
        zoo.showAllAnimals();

       context.close();





    }
}
