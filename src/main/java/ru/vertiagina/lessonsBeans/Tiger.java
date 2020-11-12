package ru.vertiagina.lessonsBeans;

/**
 * Author irkin
 **/
public class Tiger implements Animal {

    //fields
    Part part;
    String name;
    int age;

    //ctors
    private Tiger() {
    }
    private Tiger(Part part) {
        this.part = part;
    }
    private Tiger(Part part, String name, int age) {
        this.part = part;
        this.name = name;
        this.age = age;
    }

    //factory method
    public static Tiger factory(){
      return new Tiger();
    }

    @Override
    public String makeNoise() {
        return "I am a TIGER "+name + part.getPart() +age+" age old " ;
    }

    //init
    public void doInit(){
        System.out.println("Initializing TIGER bean...");
    }
    //destroy
    public void doDestroy(){
        System.out.println("Destroying TIGER bean...");
    }

    //setters and getters
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
}
