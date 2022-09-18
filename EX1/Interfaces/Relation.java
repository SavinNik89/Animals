package Interfaces;

import Classes.Animal;
import Classes.People;

import java.util.List;

public interface Relation {
    void addAnimal (People human, Animal animal);
    List<Animal> findAnimalsByHuman (People human);
}
