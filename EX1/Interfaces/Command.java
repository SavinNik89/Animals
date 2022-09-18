package Interfaces;

import Classes.Animal;
import Classes.Dog;

public interface Command {

    void sit (Animal animal);

    void stay (Animal animal);

    void down (Animal animal);

    void come (Animal animal);

    void kiskis (Animal animal);
}
