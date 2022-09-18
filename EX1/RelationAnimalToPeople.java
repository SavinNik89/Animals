import Classes.Animal;
import Classes.People;
import Interfaces.Relation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RelationAnimalToPeople implements Relation {
    private HashMap<People, List<Animal>> listAnimalByHuman;

    public RelationAnimalToPeople() {
        listAnimalByHuman = new HashMap<>();
    }

    @Override
    public void addAnimal (People human, Animal animal) {
        if (listAnimalByHuman.containsKey(human)){
            listAnimalByHuman.get(human).add(animal);
        } else {
            List<Animal> toAdd = new ArrayList<>();
            toAdd.add(animal);
            listAnimalByHuman.put(human, toAdd);
        }
    }

    @Override
    public List<Animal> findAnimalsByHuman(People human) {
        System.out.println("Animals of" + ' ' + human.getName() + ':');
        return listAnimalByHuman.get(human);
    }


}
