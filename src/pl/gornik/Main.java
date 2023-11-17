package pl.gornik;

import pl.gornik.model.Animal;
import pl.gornik.model.Cat;
import pl.gornik.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Animal dog1 = new Dog("Burek",5.5,"ssak");
        Animal dog2 = new Animal("Azor", 10.5,"ssak");

        Animal cat1 = new Cat("Kicia", 2.5, "ssak", "test");

        List<Dog> dogs = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);

        dog1.giveVoice(" ");
    }
}