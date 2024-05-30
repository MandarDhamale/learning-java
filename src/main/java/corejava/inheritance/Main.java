package corejava.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){


        Crocodile crocodile = new Crocodile();
//        crocodile.setAnimalType("Reptile");
//        crocodile.setBackbone("Has backbone");
//        crocodile.setBloodType("Cold blooded");

//        System.out.println(crocodile.toString());

        Animal animal = new Animal();
        Reptile reptile = new Reptile();
        Animal fish = new Fish();

        List<Animal> animals = new ArrayList<>();

        animals.add(animal);
        animals.add(crocodile);
        animals.add(reptile);
        animals.add(fish);

        listAnimals(animals);



    }

    private static void listAnimals(List<Animal> animals) {

        for(Animal animal: animals){
            System.out.println(animal);
        }


    }

}
