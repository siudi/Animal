package pl.gornik.model;

public class Cat extends Animal{

    String test;

    public Cat(String name, double weight, String type, String test) {
        super(name, weight, type);
        this.test = test;
    }

    public Cat(Animal animal, String test) {
        super(animal);
        this.test = test;
    }

    public void giveVoice(String str) {
        str = "Miau, miau";
        super.giveVoice(str);
    }
}
