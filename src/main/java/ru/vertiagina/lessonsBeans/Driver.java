package ru.vertiagina.lessonsBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author irkin
 **/
public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //All animal-beans are autowired into zoo
        Zoo zoo = context.getBean("zoo", Zoo.class);
        zoo.showAnimal();



       context.close();

    }//main
}//class
