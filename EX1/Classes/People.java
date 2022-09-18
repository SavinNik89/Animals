package Classes;

import Interfaces.Command;

public class People implements Command {
    private String name;


    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sit (Animal animal) {
        if (checkClass(animal, Dog.class)) {
            ((Dog) (animal)).setSit(true);
            ((Dog) (animal)).setStay(false);
            ((Dog) (animal)).setDown(false);
        } else {
            System.out.println("This command can only be performed by dogs");
        }
    }

    @Override
    public void stay (Animal animal) {
        if (checkClass(animal, Dog.class)) {
            ((Dog) (animal)).setSit(false);
            ((Dog) (animal)).setStay(true);
            ((Dog) (animal)).setDown(false);
        } else {
            System.out.println("This command can only be performed by dogs");
        }
    }

    @Override
    public void down (Animal animal) {
        if (checkClass(animal, Dog.class)) {
            ((Dog) (animal)).setSit(false);
            ((Dog) (animal)).setStay(false);
            ((Dog) (animal)).setDown(true);
        } else {
            System.out.println("This command can only be performed by dogs");
        }
    }

    @Override
    public void come (Animal animal) {
        if (checkClass(animal, Dog.class)) {
            ((Dog) (animal)).setDistanсeToCalling(((Dog) (animal)).getDistanсeToCalling() - ((Dog) (animal)).getSpeed());
            if (((Dog) (animal)).getDistanсeToCalling() < 0){
                ((Dog) (animal)).setDistanсeToCalling(0);
            }
        } else {
            System.out.println("This command can only be performed by dogs");
        }
    }

    @Override
    public void kiskis(Animal animal) {
        if (checkClass(animal, Cat.class)) {
            ((Cat) (animal)).setDistanсeToCalling(((Cat) (animal)).getDistanсeToCalling() - ((Cat) (animal)).getSpeed());
            if (((Cat) (animal)).getDistanсeToCalling() < 0) {
                ((Cat) (animal)).setDistanсeToCalling(0);
            }
        } else {
            System.out.println("This command can only be performed by cats");
        }
    }


    private static boolean checkClass (Animal animal, Class<?> cls) {
        return  cls.isInstance(animal);
    }
}
