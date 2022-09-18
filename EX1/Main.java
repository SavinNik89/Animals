import Classes.Animal;
import Classes.Cat;
import Classes.Dog;
import Classes.People;

public class Main {
    public static void main(String[] args) {
        Animal jeck = new Dog("Jeck", "Black", 5);
        System.out.println(jeck);
        Animal kitty = new Cat("Kitty", "White", 10);
        System.out.println(kitty);

        Animal murka = new Cat("Murka", "Red", 1);
        Animal bobik = new Dog("Bobik", "Red", 2);

        Animal tom = new Cat("Tom", "Red", 1);
        Animal reks = new Dog("Reks", "Red", 5);

        People djo = new People("Djo");
        People ivan = new People("Ivan");

        RelationAnimalToPeople relation = new RelationAnimalToPeople();
        relation.addAnimal(djo, jeck);
        relation.addAnimal(djo, kitty);
        relation.addAnimal(djo, tom);
        relation.addAnimal(ivan, murka);
        relation.addAnimal(ivan, bobik);
        relation.addAnimal(ivan, reks);

        System.out.println(relation.findAnimalsByHuman(djo));

        System.out.println(relation.findAnimalsByHuman(ivan));



        djo.come(jeck);
        djo.come(jeck);
        ivan.down(jeck);
        djo.sit(jeck);
        System.out.println(jeck);

        djo.kiskis(kitty);
        System.out.println(kitty);

    }








//    public static boolean checkClass (Animal animal, Class<?> cls) {
//        return  cls.isInstance(animal);
//    }
}

