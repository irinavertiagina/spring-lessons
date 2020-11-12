package ru.vertiagina.lessonsBeans;

/**
 * Author irkin
 **/
public class Lion implements Animal {
    //fields
    Part part;
    String name;
    int age;

    //ctor
    public Lion() {
    }

    public Lion(Part part) {
        this.part = part;
    }

    public Lion(Part part, String name, int age) {
        this.part = part;
        this.name = name;
        this.age = age;
    }

    //setter and getter
    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String makeNoise() {
        return "I am a LION " + name + part.getPart() + age + " age old ";
    }

    //init
    public void doInit() {
        System.out.println("Initializing LION bean...");
    }

    //destroy
    public void doDestroy() {
        System.out.println("Destroying LION bean...");
    }
}//class